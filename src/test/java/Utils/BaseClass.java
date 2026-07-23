package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass
{
	public static WebDriver driver;
	
	public void setChrome()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\eclipse-workspace\\Excelproject2\\Browsers\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origin=*");
	driver=new ChromeDriver(options);
	}
	


}
