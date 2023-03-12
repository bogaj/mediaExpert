package pl.pb.mediaexpert.tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pl.pb.mediaexpert.configuration.ConfigurationReader;
import pl.pb.mediaexpert.configuration.PopUpBlocker;

import java.io.IOException;

public class TestBase {


    @BeforeClass
    public void beforeClass() throws IOException {

        PopUpBlocker.configureOptions(Configuration.browser);
        ConfigurationReader.loadConfiguration();



    }
@BeforeMethod
    public void beforeTest(){

}
   }

