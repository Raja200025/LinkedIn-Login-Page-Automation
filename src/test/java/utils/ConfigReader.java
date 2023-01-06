package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties getPropertyObject() throws IOException {
        FileInputStream fis=new FileInputStream("Config/Configuration.properties");
        Properties prop=new Properties();
        prop.load(fis);
        return prop;
    }

    public static  String getUsername() throws IOException {
//        System.out.println(getPropertyObject().getProperty("username"));
        return  getPropertyObject().getProperty("username");
    }
    public static String getPassword() throws IOException {
//        System.out.println(getPropertyObject().getProperty("password"));
        return getPropertyObject().getProperty("password");

    }
}
