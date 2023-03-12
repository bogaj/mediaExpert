package pl.pb.mediaexpert.configuration;

import com.codeborne.selenide.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigurationReader {

    public static void loadConfiguration() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\configuration.properties");
        properties.load(fileInputStream);


        Configuration.browser = properties.getProperty("browserName");
        Configuration.browserSize = "1920x1080";

        fileInputStream.close();
    }


}
