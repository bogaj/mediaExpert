package pl.pb.mediaexpert.tests;

import org.testng.annotations.BeforeClass;
import pl.pb.mediaexpert.configuration.ConfigurationReader;

import java.io.IOException;

public class TestBase {


    @BeforeClass
    public void beforeClass() throws IOException {
        ConfigurationReader.loadConfiguration();
    }

   }

