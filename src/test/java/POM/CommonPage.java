package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.FileWriter;
import java.io.IOException;
public class CommonPage 
{
	WebDriver driver;
	
	
	By fullNameLocator = By.xpath("//*[text()='Full Name']");


	public CommonPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void openurl(String url)
	{
		driver.get(url);
	}

	


	public void copy_paste() throws IOException 
	{
		

		WebElement element = driver.findElement(fullNameLocator);

		String text = element.getText();

		System.out.println("Text: " + text);

		FileWriter writer = new FileWriter("target/copiedText.txt");

		writer.write(text);

		writer.close();
		
	}
	
	public String readTextFromFile() throws IOException {

	    return java.nio.file.Files.readString(
	            java.nio.file.Path.of("target/copiedText.txt"));
	}
	
}
