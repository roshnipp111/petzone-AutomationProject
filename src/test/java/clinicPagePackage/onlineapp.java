package clinicPagePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class onlineapp {
	WebDriver driver;
	
	
	
	 @FindBy(xpath="//*[@id=\"request-consult\"]/div/div")
		WebElement online;
		@FindBy(xpath="//*[@id=\"form-field-name\"]")
		WebElement pet;
		@FindBy(xpath="//*[@id=\"form-field-field_8702e53\"]")
		WebElement ownername;
		@FindBy(xpath="//*[@id=\"form-field-field_fc9b0a1\"]")
		WebElement contact1;
		@FindBy(xpath="//*[@id=\"form-field-email\"]")
		WebElement email;
		@FindBy(xpath="//*[@id=\"elementor-popup-modal-990\"]/div/div[2]/div/div/section/div/div/div/div[3]/div/form/div[2]/div[1]/div[6]/div/button")
		WebElement nex;
		@FindBy(xpath="//*[@id=\"form-field-field_2f69073\"]")
		WebElement time;
		@FindBy(xpath="/html/body/div[8]/div/span[2]")
		WebElement Tpm;
		@FindBy(xpath="//*[@id=\"form-field-field_b64d999\"]")
		WebElement drop;
		@FindBy(xpath="//*[@id=\"elementor-popup-modal-990\"]/div/div[2]/div/div/section/div/div/div/div[3]/div/form/div[2]/div[2]/div[5]/div[2]/button")
		WebElement next;
		@FindBy(xpath="/html/body/div[8]/div/div[1]/input")
		WebElement consultTime;
	
	
	public onlineapp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void appbyonline() throws InterruptedException
	{
		Thread.sleep(1000);
		online.click();
		pet.sendKeys("tommy");
		ownername.sendKeys("daniel");
		contact1.sendKeys("9544497796");
		email.sendKeys("daniel123@gmail.com");
		Thread.sleep(1000);
		nex.click();
		Thread.sleep(1000);
		datePicker("28");
		Thread.sleep(3000);
		
		WebElement element= driver.findElement(By.xpath("//*[@id='form-field-field_b64d999']"));
		 Select mode =new Select(element);
		 mode.selectByVisibleText("Email");
		 
		 Thread.sleep(2000);
		time.click();
		Thread.sleep(2000);
		consultTime.click();
		Thread.sleep(1000);
		next.click();
		
	}
	private void datePicker(String ExptDate) throws InterruptedException {
		List<WebElement> date=driver.findElements(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/span"));
		for(WebElement d:date)
		{
			String date1=d.getText();
			System.out.println(date1);
			if(date1.equals(ExptDate))
			{
				d.click();
				break;
				
			}	
		}
		
		
		
	}

	
	
	
	
	

}
