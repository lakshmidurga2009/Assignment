
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AssignmentPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public AssignmentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.actions = new Actions(driver); // Initialize Actions
    }

    public void verifyInsurePage() {
        // Implement verification logic, e.g., checking a title or a specific element is displayed
       // wait.until(ExpectedConditions.titleContains("Insure Page Title")); // Replace with actual title
    }

    public void GetStarted() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Get Started')]"))).click();
    }

    public void spouseradiobtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Spouse')]"))).click();
    }

    public void nextbtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-next']"))).click();
    }

    public void Supplementslifeforspousecheckbox() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox-item-0']"))).click();
    }

    public void enterFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name"))).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last_name"))).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email-input"))).sendKeys(email);
    }

    public void amountofSupplementalCoverage() {
    	By sliderHandle = By.xpath("//div[@class='rc-slider-handle']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(sliderHandle));

        // Perform drag-and-drop
        actions.clickAndHold(driver.findElement(sliderHandle))
               .moveByOffset(50, 0) // Change this offset as needed
               .release()
               .build()
               .perform();
    }

    public void enterDateOfBirth(String dob) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("date-input"))).sendKeys(dob);
    }

    public void selectGender(String gender) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'" + gender + "')]"))).click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Enter your phone number']"))).sendKeys(phoneNumber);
    }

    public void enterAddress(String address) {
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address-input-autocomplete")));
    	driver.findElement(By.xpath("//div[@id='btn-toggle-autocomplete']")).click();
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address-input-street")));
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address-input-street"))).sendKeys(address);
          driver.findElement(By.xpath("//input[@id='address-input-city']")).sendKeys("Rochester");
          driver.findElement(By.cssSelector("[aria-label=\"address state select\"]")).sendKeys("New York");
         
        
          driver.findElement(By.xpath("//input[@id='address-input-zipcode']")).sendKeys("14611");
    }

    public void enterAddressApt(String apt) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address-input-apt-unit"))).sendKeys(apt);
    }

    public void selectConsentAndNotice() {
    	  // Locate the consent checkbox for business
        WebElement consentCheckbox = driver.findElement(By.id("address-check-consent-business"));
        
        // Scroll to the consent checkbox and click it using JavaScript to avoid any issues with visibility
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", consentCheckbox);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", consentCheckbox);
   
        // Locate the authorization release checkbox
        WebElement checkbox = driver.findElement(By.id("address-label-consent-business"));
       
        // Scroll to the authorization release checkbox and wait until it's clickable before clicking
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
      
        checkbox.click();

  

    }

    public void enterHeight(String height) {
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("height-input")));

           WebElement dropdown = driver.findElement(By.id("height-input"));
       
          Select select = new Select(dropdown);
       
          select.selectByVisibleText("Option Text");
    }

    public void enterWeight(String weight) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("weight-input"))).sendKeys(weight);
    }

    public void selectNoPregnant() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pregnant-no']"))).click();
    }

    public void selectNoMedication() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='medication-no']"))).click();
    }

    public void selectNoneForTreatment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='treatment-none']"))).click();
    }

    public void selectNoneForDiagnosed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='diagnosed-none']"))).click();
    }

    public void selectNoExamined() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='examined-no']"))).click();
    }

    public void submit() {
       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-submit']"))).click();
    }
}

