package clinicPagePackage;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verifications {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"top-logo\"]/div/div[1]/div/a/img")
	WebElement logo;
	
	
	//screenshot
	public void screenshot() throws IOException
	 {
		 File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(s, new File(".\\screenshot\\img1.png"));
	}
	
	public Verifications(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void titleVerification()
	{
		String Actual=driver.getTitle();
		System.out.println("Title is"+Actual);
		String Expect="Home-Petzone";
		if(Actual.contentEquals(Expect))
		{
			System.out.println("Title verification passed");
		}
		else 
		{
			System.out.println("Title verification failed");
			
		}
		
		
	}
	//link Count and ResponseCode
		public void LinkAndResponseCount() throws IOException
		{
			URL u=new URL("https://www.petzone.in/");
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			List<WebElement> element=driver.findElements(By.tagName("a"));
			for(WebElement e :element)
			{
				String s=e.getAttribute("Href");
				System.out.println("\n"+e.getText());
				System.out.println("link is---------------------------------------"+s);
				int code=con.getResponseCode();
				if(code==200)
				{
					System.out.println("code is 200");
				}
				else if(code==404)
				{
					System.out.println("The code is 404");
				}
				else
				{
					System.out.println("the code is"+code);
				}
			}
		}
		
		//logoVerification
		public void logoVerification()
		{
			if(logo.isDisplayed())
			{
				System.out.println("Logo is displayed");
			}
			else 
			{
				System.out.println("logo is not displayed ");
			}
			
			
		}

}
