package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\Feature\\copy_button_without_TookKit.feature",
        		glue = {"StepDefination", "Utils"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/report.html",
                "json:target/cucumber.json",       
        }            
)
public class TestRunner 
{ 

}

