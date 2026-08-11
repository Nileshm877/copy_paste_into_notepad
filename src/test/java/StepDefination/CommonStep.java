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



}
