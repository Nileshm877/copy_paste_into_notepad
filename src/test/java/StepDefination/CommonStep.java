package StepDefination;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.junit.Assert;

import POM.CommonPage;
import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStep extends BaseClass 
{
	
	String copiedText;

	@Given("open url {string}")
	public void open_url(String url) 
	{
		CommonPage cp = new CommonPage(driver);
		cp.openurl(url);

	}
	
	@When("copy Full Name and paste into textpad")
	public void copy_full_name_and_paste_into_textpad() throws IOException
	{
		CommonPage cp = new CommonPage(driver);
		cp.copy_paste();
	} 
   
	@Then("User verifies the text in text file")
	public void user_verifies_the_text_in_text_file() throws IOException 
	{
		CommonPage cp = new CommonPage(driver);

	    String actualText = cp.readTextFromFile();

	    String expectedText = "Full Name";

	    System.out.println("Expected Text: " + expectedText);
	    System.out.println("Actual Text: " + actualText);

	    assert actualText.equals(expectedText);
	}
	
	
	
	@When("User clicks on Copy button")
	public void user_clicks_on_copy_button() throws HeadlessException, UnsupportedFlavorException, IOException 
	{
		CommonPage cp = new CommonPage(driver);
		// Click actual Copy button
		cp.clickCopyButton();

        // Get actual clipboard text
        copiedText = cp.getCopiedTextFromClipboard();
	   
	}
	@When("User pastes the copied text into text file")
	public void user_pastes_the_copied_text_into_text_file() throws IOException
	{
		CommonPage cp = new CommonPage(driver);
		cp.pasteTextIntoFile(copiedText);
	}
	@Then("User verifies the text in text file1")
	public void user_verifies_the_text_in_text_file1() throws IOException 
	{
		CommonPage cp = new CommonPage(driver);

		String actualText = cp.readTextFromFile();

        System.out.println("Copied Text : " + copiedText);
        System.out.println("File Text   : " + actualText);

        Assert.assertTrue(actualText.equals(copiedText));
	}

}
