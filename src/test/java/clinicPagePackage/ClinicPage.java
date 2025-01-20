package clinicPagePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClinicPage {
	 WebDriver driver;
	 
	 
	 @FindBy(xpath="//*[@id=\"menu-1-fde94b5\"]/li[10]/a")
	 WebElement loginbtn;
	 @FindBy(xpath="/html/body/div[1]/div/section/div/div[2]/div/section/div/div/div/div/div/div/div/div/form/div[2]/div[2]/a")
	 WebElement registerbtn;
	 @FindBy(id="user_login-1827")
	 WebElement username;
	 @FindBy(id="first_name-1827")
	 WebElement fname;
	 @FindBy(id="last_name-1827")
	 WebElement lname;
	 @FindBy(id="user_email-1827")
	 WebElement email;
	 @FindBy(id="user_password-1827")
	 WebElement pass;
	 @FindBy(id="confirm_user_password-1827")
	 WebElement cpasswd;
	 @FindBy(xpath="//*[@class=\"um-left um-half\"]")
	 WebElement register; 
	 
	 public ClinicPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 //login
	 public void petLogin()
	 {
		 loginbtn.click();
		 registerbtn.click();
		 
	 }
	 //registration
	 public void register() throws InterruptedException
	 {
		 username.sendKeys("user11"); 
		 fname.sendKeys("roshni");
		 lname.sendKeys("p");
		 email.sendKeys("roshnipp124@gmail.com");
		 pass.sendKeys("Petpass11");
		 cpasswd.sendKeys("Petpass11");
			
			WebElement reg=driver.findElement(By.xpath("//*[@class='um-left um-half']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView({block:'center'});", reg);
			 Thread.sleep(3000);
			reg.click();
			
 }

}
