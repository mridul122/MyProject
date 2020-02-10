package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Utils {


    public static String utilPath = "/Users/mridul.das/.jenkins/MyNewProject/src/Resources/EnvironmentFile.properties";



    public static  String getValue(String key) throws Exception
    {
        File propsFile = new File(utilPath);
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(propsFile);
        prop.load(fis);
        return prop.getProperty(key);

    }


}
