package cucumber.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Newaccount {

    private WebDriver driver;

    @Given("an open browser with https://tester.codersguru.pl")

    public void addAcount() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64/chromedriver");

        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();

        // Przejdź do Codersguru
        driver.get("https://tester.codersguru.pl");
    }

    @When("zaloz konto buttom is selected")
    public void zalozKontoButtom() {
        // Wybranie pola "załóż konto"

        WebElement zalozKonto = driver.findElement(By.xpath("/html/body/section[3]/div/form/input[2]"));
        // Wyczyść tekst zapisany w elemencie
        zalozKonto.click();
    }

    @And("a keyword (.*) is entered in input email field")
    public void enterKeywordEmail(String email) {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy

        WebElement InputEmail = driver.findElement(By.id("fos_user_registration_form_email"));
        // Wyczyść tekst zapisany w elemencie
        InputEmail.clear();
        // Wpisz informacje do pola email z adesem
        InputEmail.sendKeys(email);
    }


    @And("a keyword (.*) is entered in input name field")
            public void enterKeywordName(String name) {
            // Znajdź element wprowadzania tekstu na podstawie jego nazwy

            WebElement InputName = driver.findElement(By.id("fos_user_registration_form_name"));
            // Wyczyść tekst zapisany w elemencie
            InputName.clear();
            // Wpisz informacje do pola email z adesem
            InputName.sendKeys(name);
        }

      @And("a keyword (.*) is entered in input surname field")
            public void enterKeywordSurname(String surname) {
             // Znajdź element wprowadzania tekstu na podstawie jego nazwy

             WebElement InputSurname = driver.findElement(By.id("fos_user_registration_form_lastname"));
             // Wyczyść tekst zapisany w elemencie
             InputSurname.clear();
             // Wpisz informacje do pola email z adesem
             InputSurname.sendKeys(surname);
         }

             @And("a keyword (.*) is entered in input password field")
             public void enterKeywordPassword(String password) {
                 // Znajdź element wprowadzania tekstu na podstawie jego nazwy

                 WebElement Inputpassword = driver.findElement(By.id("fos_user_registration_form_plainPassword_first"));
                 // Wyczyść tekst zapisany w elemencie
                 Inputpassword.clear();
                 // Wpisz informacje do pola email z adesem
                 Inputpassword.sendKeys(password);

        }

             @And("a keyword (.*) is entered in input repeatPassword field")
                 public void enterKeywordRepeatPassword(String repeatPassword) {
                 // Znajdź element wprowadzania tekstu na podstawie jego nazwy

                 WebElement InputRepeatPassword = driver.findElement(By.id("fos_user_registration_form_plainPassword_second"));
                 // Wyczyść tekst zapisany w elemencie
                 InputRepeatPassword.clear();
                 // Wpisz informacje do pola email z adesem
                 InputRepeatPassword.sendKeys(repeatPassword);
        }

                 @And("a keyword (.*) is entered in input city field")
                 public void enterKeywordCity(String city) {
                     // Znajdź element wprowadzania tekstu na podstawie jego nazwy

                     WebElement InputCity = driver.findElement(By.id("form_city"));
                     // Wyczyść tekst zapisany w elemencie
                     InputCity.clear();
                     // Wpisz informacje do pola email z adesem
                     InputCity.sendKeys(city);

         }

                  @And("a keyword (.*) is entered in input Post-Code field")
                     public void enterKeywordPostCode(String keyword_kod) {
                      // Znajdź element wprowadzania tekstu na podstawie jego nazwy

                      WebElement kod = driver.findElement(By.id("form_postal_code"));
                      // Wyczyść tekst zapisany w elemencie
                      kod.clear();
                      // Wpisz informacje do pola email z adesem
                      kod.sendKeys(keyword_kod);

                  }

                  @And("a keyword (.*) is entered in input street field")
                    public void enterKeywordStreet(String street) {
                         // Znajdź element wprowadzania tekstu na podstawie jego nazwy

                         WebElement InputStreet = driver.findElement(By.id("form_street"));
                         // Wyczyść tekst zapisany w elemencie
                         InputStreet.clear();
                         // Wpisz informacje do pola email z adesem
                         InputStreet.sendKeys(street);
                     }

                     @And("a keyword (.*) is entered in input house number field")
                    public void enterKeywordHouseNumber(String houseNumber) {
                 // Znajdź element wprowadzania tekstu na podstawie jego nazwy

                     WebElement InputHouseNumber = driver.findElement(By.id("form_number"));
                    // Wyczyść tekst zapisany w elemencie
                    InputHouseNumber.clear();
                    // Wpisz informacje do pola email z adesem
                    InputHouseNumber.sendKeys(houseNumber);
                        }


                    @And("Select akceptacja regulaminu")
                    public void regulamin() {
                    WebElement regulamin = driver.findElement(By.name(""));
                    regulamin.click();
                      }


                    @And("zarejestruj buttom is selected")
                    public void zarejestruj() {
                        // Znajdź element wprowadzania tekstu na podstawie jego nazwy

                        WebElement submitButtom = driver.findElement(By.id("register-submit-btn"));
                        // Prześlij formularz
                        submitButtom.submit();

                    }

                   @Then("an account should be created")
                        public void AnaccountCreated (){
                            System.out.println();

                    }
                     @And("close browser")
                        public void closeBrowser(){
                     driver.quit();
                         }



}



