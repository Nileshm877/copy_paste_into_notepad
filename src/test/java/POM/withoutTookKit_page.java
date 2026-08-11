package POM;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
public class withoutTookKit_page 
{
	WebDriver driver;
	WebDriverWait wait;
	
	By fullNameLocator = By.xpath("//*[text()='Full Name']");
	By copyButton = By.xpath("//*[@class='w3-button w3-border w3-light-grey w3-left w3-mobile']");


	public withoutTookKit_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void openurl(String url) throws InterruptedException
	{
		driver.get(url);
		

		
	}

	public void clickCopyButton() throws InterruptedException 
	{
		     WebElement ele=driver.findElement(copyButton);
		   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		     wait.until(ExpectedConditions.visibilityOf(ele));
		     ele.click();

	        System.out.println("Copy button clicked");
	        
	       
		
	}


	public String getCopiedTextFromClipboard() throws HeadlessException, UnsupportedFlavorException, IOException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;

        String copiedText = (String) js.executeAsyncScript(
                "const callback = arguments[arguments.length - 1];" +
                "navigator.clipboard.readText()" +
                ".then(text => callback(text))" +
                ".catch(error => callback('CLIPBOARD_ERROR: ' + error));"
        );

        if (copiedText.startsWith("CLIPBOARD_ERROR:")) {
            throw new RuntimeException(copiedText);
        }

        System.out.println("Copied Text: " + copiedText);

        return copiedText;
    }

		
	
		
	public void pasteTextIntoFile(String copiedText) throws IOException 
	{
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("target/copiedText.txt");

        writer.write(copiedText);

        writer.close();

        System.out.println("Text pasted into text file");
		
	}
	
	
	public String readTextFromFile() throws IOException 
	{

	    return java.nio.file.Files.readString(
	            java.nio.file.Path.of("target/copiedText.txt"));
	}

	

	

	
	
	
}
