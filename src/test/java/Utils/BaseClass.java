package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass
{
	public static WebDriver driver;
	
	public void setChrome()
	{
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		
		
	}
	


}
