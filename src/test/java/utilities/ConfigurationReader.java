package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();
    static{
        try {
            //reading the file --> provide path of the file
            FileInputStream fileInputStream = new FileInputStream("config.properties");
            //load the contents of the file to the properties object
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);

    }
}


