package Practice;

import com.fasterxml.jackson.databind.ObjectMapper;
import gherkin.deps.com.google.gson.Gson;
import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;

public class Json2Java {

//

    public static void main(String[] args) throws Exception {


        JSONArray jsonArray = new JSONArray();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = null;
        con = DriverManager.getConnection("jdbc:oracle:thin:@//10.30.19.16:1521/SBLPKG", "siebel", "thR#ll321");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from siebel.cx_audit_search where rownum<=2 order by audit_dt desc");

        SearchDetails sd = new SearchDetails();

        ArrayList<SearchDetails> arrayList = new ArrayList<SearchDetails>();

        while (rs.next()) {

            sd.setAudit_dt(rs.getString(8));
            sd.setSearchExpression(rs.getString(17));

            sd.getAudit_dt();
            sd.getSearchExpression();

            arrayList.add(sd);
           // System.out.println("The sd is  "+arrayList);
        }

        //System.out.println(ojbMap.writeValueAsString(sd));
        //System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            ObjectMapper ojbMap = new ObjectMapper();
            ojbMap.writeValue(new File("/Users/mridul.das/DWP-Audit/MyNewProject/src/Resources/searchInfo" + i + ".json"), arrayList.get(i));
            Gson gson = new Gson();
            String jsonString = gson.toJson(arrayList.get(i));
            jsonArray.add(jsonString);


        }

        //Create json string from json object

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", jsonArray);
        System.out.println("This is json string"+jsonObject.toJSONString());
        String uescapedstring = StringEscapeUtils.unescapeJava(jsonObject.toJSONString());

        String newString=uescapedstring.replace("\"{","{");
        String finalString=newString.replace("}\"","}");
        System.out.println("This is final string"+finalString);

        FileWriter file = new FileWriter("/Users/mridul.das/DWP-Audit/MyNewProject/src/Resources/searchInfo.json");
        file.write(finalString);

        con.close();


    }


}
