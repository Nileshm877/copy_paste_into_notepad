package StepDefination;

import POM.Dyanamic_POM;
import Utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Dyanamic_step extends BaseClass
{
	@Given("open url {string}")
	public void open_url(String url)
	{
		Dyanamic_POM DP=new Dyanamic_POM(driver);
		DP.openurl(url);
		
	}
	@Then("verify firstname {string} is available")
	public void verify_firstname_is_available(String name)
	{
		Dyanamic_POM DP=new Dyanamic_POM(driver);
		DP.firstname(name);
	    
	}

}
