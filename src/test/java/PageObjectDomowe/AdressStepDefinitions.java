package PageObjectDomowe;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AdressStepDefinitions {


    AdressInfoPage adressPage;
    WebDriver driver;

    @Given("User is logged in to My story shop")
    public void userIsLooggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");

        adressPage = new AdressInfoPage(driver);
    }


    @When("User signs up for our new alias")
    public void userSingUpForOurNewAddress() {
        adressPage.setAliasInput();
    }

    @And("User signs up for our first name")
    public void userSingUpForOurFirstName() {
        adressPage.setFirstNameInput();
    }

    @And("User signs up for our last name")
    public void userSingUpForOurLastName() {
        adressPage.setLastNameInput();
    }

    @And("User signs up for company")
    public void userSingUpForCompany() {
        adressPage.setCompanyInput();
    }

    @And("User signs up for vat")
    public void userSingUpForVat() {
        adressPage.setVat_numberInput();
    }

    @And("User signs up for address1")
    public void userSingUpForrAddress1() {
        adressPage.setAddress1Input();
    }

    @And("User signs up for address2")
    public void userSingUpForrAddress2() {
        adressPage.setAddress2Input();
    }


    @And("User signs up for city")
    public void userSingUpForCity() {
        adressPage.setCityInput();
    }
    @And("User signs up for post code")
    public void userSingUpForPostCode() {
        adressPage.setPostcodeInput();
    }



    @And("User signs up for United Kingdom")
    public void userSingsUpForUnitedKingdom() {
        adressPage.setId_countryInput();
    }

    @And("User signs up phone number")
    public void userSingsUpPhoneNumber() {
        adressPage.setPhoneInput();

    }

    @And("User saves information")
    public void userSavesInformation() {
        adressPage.setSubmitButton();
    }


    @Then("User zmienil haslo")
    public void userSees() {
        driver.quit();

    }
}





