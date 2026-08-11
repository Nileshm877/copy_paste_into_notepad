package StepDefination;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.junit.Assert;

import POM.CommonPage;
import POM.withoutTookKit_page;
import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class withoutToolkit_step extends BaseClass 
{
	
	String copiedText;

	@Given("open url without_tookkit {string}")
	public void open_url_without_tookkit(String url) throws InterruptedException 
	{
		withoutTookKit_page cp = new withoutTookKit_page(driver);
		cp.openurl(url);


	}
	@When("User clicks on Copy button without_TookKit")
	public void user_clicks_on_copy_button_without_took_kit() throws HeadlessException, UnsupportedFlavorException, IOException
	{
		withoutTookKit_page cp = new withoutTookKit_page(driver);
		cp.clickCopyButton();
		
		// Get actual clipboard text
        copiedText = cp.getCopiedTextFromClipboard();


	}
	@When("User pastes the copied text into text file without_TookKit")
	public void user_pastes_the_copied_text_into_text_file_without_took_kit() throws IOException
	{
		
		withoutTookKit_page cp = new withoutTookKit_page(driver);
		cp.pasteTextIntoFile(copiedText);


	}
	@Then("User verifies the text in text file without_TookKit")
	public void user_verifies_the_text_in_text_file_without_took_kit() throws IOException
	{
		withoutTookKit_page cp = new withoutTookKit_page(driver);

		String actualText = cp.readTextFromFile();

        System.out.println("Copied Text : " + copiedText);
        System.out.println("File Text   : " + actualText);

        Assert.assertTrue(actualText.equals(copiedText));
	   
	}



}
