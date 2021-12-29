package SQLJDBC;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.json.simple.JSONObject;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {

    public static void main(String[] args) throws  Exception {

        POJOClass pj = new POJOClass();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=null;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Business","root","root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from CustomerInfo where  Location ='Asia';");
        while(rs.next()){

            pj.setCourseName(rs.getString(1));
            pj.setPurchaseDate(rs.getString(2));
            pj.setAmount(rs.getInt(3));
            pj.setLocation(rs.getString(4));

            ObjectMapper objectMapper = new ObjectMapper();
           // objectMapper.writeValue(new File("C:\\Users\\hp\\Downloads\\MyPracticse\\MyProject\\src\\Resources\\example.json"),pj);

           Gson g = new Gson();
           String jsonData = g.toJson(pj).toString();

           System.out.println(jsonData);
//


        }


    }
}
