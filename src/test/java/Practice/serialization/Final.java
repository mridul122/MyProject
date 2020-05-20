package Practice.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.simple.JSONArray;

public class Final {


    public static void main(String[] args) throws Exception
    {


        String [] uid = {"123","111","222"};
        for (int i=0;i<uid.length;i++)
        {
            Credentials credentials = new Credentials(uid[i], "pass");
            Payload payload = new Payload (credentials);
            ObjectMapper obj = new ObjectMapper();

            String json = obj.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
            System.out.println(json);
            JSONArray jar  = new JSONArray();
            //jar.toJSONString(json);

//                    Gson gson = new Gson();
//        String json=gson.toJson(payload);
//        System.out.println(json);

        }




//        ObjectMapper obj = new ObjectMapper();
//        String json = obj.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
//        System.out.println(json);

//        Gson gson = new Gson();
//        String json=gson.toJson(payload);
//        System.out.println(json);

    }
}

