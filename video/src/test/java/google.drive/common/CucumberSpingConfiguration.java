package google.drive.common;


import google.drive.VideoApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoApplication.class })
public class CucumberSpingConfiguration {
    
}
