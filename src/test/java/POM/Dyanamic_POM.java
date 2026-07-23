package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dyanamic_POM 
{
	WebDriver driver;
	
	By table_xpath=By.xpath("//table[@id='table1']");
	
	String celltext;
	boolean b=false;

	public Dyanamic_POM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void openurl(String url)
	{
		driver.get(url);
	}
	
	public void firstname(String expected_name)
	{
		WebElement WebTable=driver.findElement(table_xpath);
		
        List<WebElement> rows=WebTable.findElements(By.tagName("tr"));
        
        int rowcount=rows.size();
        
        System.out.print(rowcount);
        
        for(int i=0;i<rowcount;i++)
        {
        	

            List<WebElement> column=rows.get(i).findElements(By.tagName("td"));
            int columncount=column.size();
        	for(int j=0;j<columncount;j++)
        	{
        		celltext=column.get(j).getText();
        		if(celltext.equals(expected_name))
        		{
        			b=true;
        			break;
        		}
        		
        	}
        }
        
        if(b==true)
        {
        	  System.out.print("available");
        }
        else
        {
        	  System.out.print("not available");
        }
        
	}
}
