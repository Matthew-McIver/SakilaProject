package cucumberTests;

import sakila.api.SakilaMicroserviceApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SakilaMicroserviceApplication.class)
public class CucumberContextConfig {
}