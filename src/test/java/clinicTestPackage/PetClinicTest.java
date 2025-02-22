package clinicTestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import clinicPagePackage.ClinicApointment;
import clinicPagePackage.ClinicPage;
import clinicPagePackage.Verifications;
import clinicPagePackage.onlineapp;

public class PetClinicTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.petzone.in/");
		driver.manage().window().maximize();
	}
	
		@Test(priority=1)
	public void appoinmtent() throws InterruptedException, AWTException 
	{
		ClinicApointment ca=new ClinicApointment(driver);
		ca.petappointment();	
	}
	
	@Test
	public void testing() throws IOException
	{
		Verifications vs=new Verifications(driver);
	vs.screenshot();
	vs.logoVerification();
	  vs.LinkAndResponseCount();
	}	
	
	@Test
	public void onapp() throws InterruptedException
	{
		onlineapp op=new onlineapp(driver);
		op.appbyonline();
		
	}

}
