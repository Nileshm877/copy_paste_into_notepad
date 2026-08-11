package Utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass
{
	public static WebDriver driver;
	
	public void setChrome()
	{
		
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();

        prefs.put(
            "profile.default_content_setting_values.clipboard",
            1
        );

        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);

		}
		
		
	}
	



