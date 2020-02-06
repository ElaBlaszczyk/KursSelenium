package PageObjectDomowe;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdressInfoPage {

    private static WebDriver driver;

    public AdressInfoPage(WebDriver driver) {
        AdressInfoPage.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "alias")
    WebElement aliasInput;

    @FindBy(name = "firstname")
    WebElement firstNameInput;

    @FindBy(name = "lastname")
    WebElement lastNameInput;

    @FindBy(name = "company")
    WebElement CompanyInput;

    @FindBy(name = "vat_number")
    WebElement vat_numberInput;

    @FindBy(name = "address1")
    WebElement address1Input;

    @FindBy(name = "address2")
    WebElement address2Input;

    @FindBy(name = "city")
    WebElement cityInput;


    @FindBy(name = "postcode")
    WebElement postcodeInput;



    @FindBy(name = "id_country")
    WebElement id_countryInput;


    @FindBy (xpath ="//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select/option[2]")
    WebElement details;


    @FindBy(name = "phone")
    WebElement phoneInput;


    @FindBy(xpath ="//*[@id=\"content\"]/div/div/form/footer")
    WebElement submitButtonn;




    public void setAliasInput() {
        aliasInput.sendKeys("Ella82");

    }

    public void setFirstNameInput() {
        firstNameInput.sendKeys("Ela");

    }

    public void setLastNameInput() {
        lastNameInput.sendKeys("Blaszczyk");

    }

    public void setCompanyInput() {
        CompanyInput.sendKeys("Milimex");
    }


    public void setVat_numberInput() {
        vat_numberInput.sendKeys("123456");

    }

    public void setAddress1Input() {
        address1Input.sendKeys("Katowicee");

    }


    public void setAddress2Input() {
        address2Input.sendKeys("Siemianowice");

    }

    public void setPostcodeInput() {
        postcodeInput.sendKeys("41-100");

    }


    public void setCityInput() {
        cityInput.sendKeys("Siemce");

    }

    public void setId_countryInput() {
        //id_countryInput.click();
        details.click();
    }
        public void setPhoneInput() {
        phoneInput.sendKeys("505052315");


    }

    public void setSubmitButton() {
       submitButtonn.click();
    }




    }





