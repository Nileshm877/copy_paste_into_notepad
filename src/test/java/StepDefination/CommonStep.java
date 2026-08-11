package StepDefination;

import java.io.IOException;

import POM.CommonPage;
import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStep extends BaseClass 
{

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

	


}
