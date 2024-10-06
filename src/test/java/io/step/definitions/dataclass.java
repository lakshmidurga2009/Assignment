package io.step.definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.*;

import io.cucumber.java.en.When;

public class dataclass {
	WebDriver driver;
	


	@When("User Enters Credentials using Datatable1")
	public void user_enters_credentials_using_datatabl1e(DataTable dataTable) {
	
		List<List<String>> data = dataTable.cells();
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
		
		
		
	  
	}



	

}
