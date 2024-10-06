package io.step.definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.datatable.*;

public class Login {
	WebDriver driver;
	
	
	@Given("User is stays on login Page")
	public void user_stays_on_loginpage() {
   // WebDriverManager.chromedriver().setup();
	ChromeOptions co = new ChromeOptions();
	co.setBrowserVersion("117");
    driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
}
	
	@When("^User Enters \"(.*)\" and \"(.*)\"$")// This method used for without Example
	public void user_enters_user_name_and_password(String uname , String pwd) throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	}
	
//	@When("User Enters userName and Password") //Normal passing parameters
//    public void User_Enters_userName_Password() throws InterruptedException {
//	Thread.sleep(5000);	
//    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//}

	@When("User Enters (.*) and (.*)$")// this method used with example keyword
	public void user_enters_user_name_and_password1(String uname , String pwd) throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
}
	
	




	@And("Clicks on Login button")
	public void clicks_on_login_button() {
		try {
			Thread.sleep(500);
			 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			// Assert.isTrue(false, null, null);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	}

	@When("User Enters Credentials using Datatable")
	public void user_enters_credentials_using_datatable(DataTable dataTable) {
	
		List<List<String>> data = dataTable.cells();
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
		
		
		
	  
	}


	@Then("User Should be navigated to Home Page")
	public void user_should_be_navigated_to_home_page() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p")).isDisplayed();
	    driver.quit();
	   	}
}