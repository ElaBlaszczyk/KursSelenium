package KatalonFormularz;

        import java.util.List;
        import java.util.concurrent.TimeUnit;
        import org.junit .*;
        import static org.junit.Assert .*;

        import org.openqa.selenium .*;
        import org.openqa.selenium.chrome.ChromeDriver;
// import org.w3c.dom.stylesheets.LinkStyle;

public class KatalonFormularz {

    private WebDriver driver;


    @Before

    public void setUp()  {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testKatalonFormularz()  {


        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        WebElement firstName = driver.findElement(By.id("first-name"));

        String imie="Ela";
        if (firstName.isEnabled()) {
            firstName.sendKeys(imie);
            System.out.println(firstName.getTagName() + " first name: " + imie);
        } else {
            fail();
        }

       assertSame("Ela", imie);


        WebElement lastName = driver.findElement(By.id("last-name"));

        String nazwisko = "Blaszczyk";
        if (lastName.isEnabled()) {
            lastName.sendKeys(nazwisko);
            System.out.println(firstName.getTagName() + " last name: " + nazwisko);
        } else {
            fail ();
        }

        List<WebElement> genders = driver.findElements(By.name("gender"));
            genders.get(0).click();




        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        dateOfBirth.clear();
        dateOfBirth.sendKeys("10/01/2000");



        WebElement address = driver.findElement(By.id("address"));
        String adres = "Katowice";
        if (address.isEnabled()){
            address.sendKeys(adres);
          System.out.println(address.getTagName() + " address: " + adres);
        }else{
            fail();
        }


        WebElement email = driver.findElement(By.id("email"));
        String mail = "e.b.2@poczta.fm";
        if (email.isEnabled()) {
            email.sendKeys(mail);
            System.out.println(email.getTagName() + " email: " + mail);
        }else{
            fail();
        }



        WebElement password = driver.findElement(By.id("password"));
        String haslo = "12345";
        if(password.isEnabled()) {
            password.sendKeys(haslo);
            System.out.println(password.getTagName() + " password: " + password);
        } else{
            fail();
        }


        WebElement company = driver.findElement(By.id("company"));
       String firma = "Milimex";
        if(company.isEnabled()) {
            company.sendKeys(firma);
            System.out.println(company.getTagName() + " Company: " + firma);
        } else{
            fail();
        }


        WebElement comment = driver.findElement(By.id("comment"));
        String komentarz = "Pierwszy test";
        if(comment.isEnabled()) {
            comment.sendKeys(komentarz);
            System.out.println(comment.getTagName() + " Comment: " + comment);
        }else{
            fail();
        }


        WebElement submitButtom = driver.findElement(By.id("submit"));
        if(submitButtom.isEnabled()) {
            submitButtom.click();
        }else {
            fail();
        }






       /*
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | Robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("uzupełniamy pole imię");
            driver.findElement(By.id("first-name")).click();
            driver.findElement(By.id("first-name")).clear();
            driver.findElement(By.id("first-name")).sendKeys("Ela");
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | Robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("uzupełniamy pole nazwisko");
            driver.findElement(By.id("last-name")).click();
            driver.findElement(By.id("last-name")).clear();
            driver.findElement(By.id("last-name")).sendKeys("Blaszczyk");
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("zaznaczamy pole gender");
            driver.findElement(By.name("gender")).click();
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekunde");
            System.out.println("wybieramy datę urodzin");
            driver.findElement(By.id("dob")).click();
            driver.findElement(By.xpath("//tr[3]/td[3]")).click();
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("uzupełniamy adres");
            driver.findElement(By.id("address")).click();
            driver.findElement(By.id("address")).clear();
            driver.findElement(By.id("address")).sendKeys("Warszawa");
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("uzupełniamy adres e mail");
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("e.b.2@poczta.fm");
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("uzupełniamy pole hasło");
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("123");
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("wybieramy Company");
            driver.findElement(By.id("company")).click();
            driver.findElement(By.id("company")).clear();
            driver.findElement(By.id("company")).sendKeys("QA");
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("wybieramy z listy zawód");
            new Select(driver.findElement(By.id("role"))).selectByVisibleText("Manager");
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("wybieramy z listy oczekiwaną prace");
            driver.findElement(By.id("role")).click();
            // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=expectation | label=Nice manager/leader]]
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("zaznaczamy sposób rozwoju");
            driver.findElement(By.xpath("//select[@id='expectation']/option[2]")).click();
            driver.findElement(By.xpath("(//input[@value=''])[2]")).click();
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("uzupełniamy komentarz");
            driver.findElement(By.id("comment")).click();
            driver.findElement(By.id("comment")).clear();
            driver.findElement(By.id("comment")).sendKeys("ddffgff");
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
            System.out.println("czekamy 1 sekundę");
            System.out.println("naciskamy zatwierdz");
            driver.findElement(By.id("submit")).click();
            assertEquals("Successfully submitted!", driver.findElement(By.id("submit-msg")).getText());
            // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot | robimy zrzut ekranu | ]]
       }
       */
    }

  @After
  public void tearDown() {
      driver.quit();

    }
}



