package clinicPagePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClinicApointment {
	WebDriver driver;
	
	 @FindBy(xpath="//*[@id=\"event_available_black_24dp\"]")
	 WebElement apponClick;
	 @FindBy(xpath="//*[@id=\"post-504\"]/div/div/div/section/div/div/div/div[3]/div/form/div[2]/div[1]/div[2]/div/span[3]/label")
	 WebElement clinicPlaceChoose;
	 @FindBy(xpath="//*[@id=\"post-504\"]/div/div/div/section/div/div/div/div[3]/div/form/div[2]/div[1]/div[3]/div/button")
	 WebElement next;
	 @FindBy(xpath="//*[@id=\"form-field-name\"]")
	 WebElement petname;
	 @FindBy(xpath="//*[@id=\"form-field-field_8702e53\"]")
	 WebElement ownerName;
	 @FindBy(xpath="//*[@id=\"form-field-field_fc9b0a1\"]")
	 WebElement contact;
	 @FindBy(xpath="//*[@id=\"form-field-email\"]")
	 WebElement contactEmail;
	 @FindBy(xpath="//*[@id=\"post-504\"]/div/div/div/section/div/div/div/div[3]/div/form/div[2]/div[2]/div[6]/div[2]/button")
	 WebElement next2;
	 @FindBy(xpath="//*[@id=\"form-field-message\"]")
	 WebElement appointmentReason;
	
	 
	 
	 
	 
	 public ClinicApointment(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 
	 public void appointment() throws InterruptedException, AWTException
	 {
		 Thread.sleep(1000);
		 apponClick.click();
		 clinicPlaceChoose.click();
		 next.click();
		 
		 petname.sendKeys("yellow");
		 ownerName.sendKeys("roshni");
		 contact.sendKeys("9544497798");
		 contactEmail.sendKeys("roshnipp123@gmail.com");
		 next2.click();
		 appointmentReason.sendKeys("dog have allergy");
		 
		 Thread.sleep(2000);
		 WebElement hoverElement = driver.findElement(By.xpath("//*[@id='form-field-field_75a1e16']"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(hoverElement).perform();
		 WebElement upload = driver.findElement(By.xpath("//*[@id='form-field-field_75a1e16']"));
		 upload.click();
		 fileUpload("C:\\Users\\ROSHNI\\Desktop\\images.jpg");
				
			}
			private void fileUpload(String p) throws AWTException, InterruptedException {
				StringSelection strSelection=new StringSelection(p);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
				
				
				Robot rob=new Robot();
				rob.delay(3000);
				rob.keyPress(KeyEvent.VK_CONTROL);
				rob.keyPress(KeyEvent.VK_V);
				rob.keyRelease(KeyEvent.VK_V);
				rob.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(3000);
				rob.keyPress(KeyEvent.VK_ENTER);
				rob.keyRelease(KeyEvent.VK_ENTER);
				rob.delay(3000);
	 }
	

}
