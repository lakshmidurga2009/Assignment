

package io.step.definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.AssignmentPage;

public class Assignment {
    WebDriver driver;
    AssignmentPage pg;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
        pg = new AssignmentPage(driver);
        driver.get("https://d28j9pfwubj8q5.cloudfront.net/5U5PU/S2xbn/app-selector");
    }

    @After
    public void tearDown() {
        DriverManager.closeDriver();
    }

    @Given("User is on insure Page")
    public void user_is_on_insure_page() {
        // Ensure the user is on the insurance page
        pg.verifyInsurePage(); // Implement this method in AssignmentPage to confirm page title or element
    }

    @When("User clicks on Gets Started button")
    public void clicks_on_gets_started_button() {
        pg.GetStarted();
    }

    @And("User selects spouse radioButton")
    public void user_selects_spouse_radio_button() {
        pg.spouseradiobtn();
        pg.nextbtn();
    }

    @And("Clicks on Next button")
    public void clicks_on_next_button() {
        pg.nextbtn();
    }

    @And("Clicks Supplements life for spouse checkbox")
    public void clicks_supplements_life_for_spouse_checkbox() {
        pg.Supplementslifeforspousecheckbox();
        pg.nextbtn();
    }

    @And("Enter first name {string} last name {string} and click on Next button")
    public void enter_first_name_last_name_and_click_on_next_button(String firstName, String lastName) {
        pg.enterFirstName(firstName);
        pg.enterLastName(lastName);
        pg.nextbtn();
    }

    @And("Enter email id {string}")
    public void enter_email_id(String email) {
        pg.enterEmail(email);
        pg.nextbtn();
    }

    @And("select amount of Supplemental Coverage and click on Next button")
    public void select_amount_of_supplemental_coverage_and_click_on_next_button() {
        pg.amountofSupplementalCoverage();
        pg.nextbtn();
    }

    @And("Enter date of Birth {string} and Click on Next button")
    public void enter_date_of_birth_and_click_on_next_button(String dob) {
        pg.enterDateOfBirth(dob);
        pg.nextbtn();
    }

    @And("select gender {string} and Click on Next button")
    public void select_gender_and_click_on_next_button(String gender) {
        pg.selectGender(gender);
        pg.nextbtn();
    }

    @And("Enter Phone Number {string} and click on Next button")
    public void enter_phone_number_and_click_on_next_button(String phoneNumber) {
        pg.enterPhoneNumber(phoneNumber);
        pg.nextbtn();
    }

    @And("Enter address {string} and Apt {string}")
    public void enter_address_and_apt(String address, String apt) {
    	
        pg.enterAddress(address);
        pg.enterAddressApt(apt);
    }

    @And("select consent and notice checkboxes and click on Next button")
    public void select_consent_and_notice_checkboxes_and_click_on_next_button() throws InterruptedException  {
    	
        pg.selectConsentAndNotice();
       
       
        WebElement nextButton = driver.findElement(By.id("btn-next"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextButton);

    }

    @And("Enter height {string} and weight {string} and click on Next button")
    public void enter_height_and_weight_and_click_on_next_button(String height, String weight) {
        pg.enterHeight(height);
        pg.enterWeight(weight);
        pg.nextbtn();
    }

    @And("select No for pregnant")
    public void select_no_for_pregnant() {
        pg.selectNoPregnant();
    }

    @And("select no for taking medication")
    public void select_no_for_taking_medication() {
        pg.selectNoMedication();
    }

    @And("select None of the above for treatment")
    public void select_none_of_the_above_for_treatment() {
        pg.selectNoneForTreatment();
    }

    @And("select None of the above for diagnosed")
    public void select_none_of_the_above_for_diagnosed() {
        pg.selectNoneForDiagnosed();
    }

    @And("No for examined by any healthcare provider")
    public void no_for_examined_by_any_healthcare_provider() {
        pg.selectNoExamined();
    }

    @And("enter first name {string} and last name {string}")
    public void enter_first_name_and_last_name(String firstName, String lastName) {
        pg.enterFirstName(firstName);
        pg.enterLastName(lastName);
    }

    @Then("sign your application")
    public void sign_your_application() {
        pg.submit();
    }
}

