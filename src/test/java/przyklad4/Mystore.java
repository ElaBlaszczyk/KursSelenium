package przyklad4;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import java.util.Random;

public class Mystore {



    public String[] products = {"mug", "t-shirt", "notebook", "Cushion", "Sweater", "POSTER"};


    Random random = new Random();
    int randomInteger = random.nextInt(6);



    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_linux64/chromedriver");

        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();

        // Przejdź do strony
        driver.get("https://prod-kurs.coderslab.pl");
    }
    @Test
    public void testMysterySearch() {


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("s"));

        // Wyczyść teskst zapisany w elemencie
         element.clear();


        // Wpisz informacje do wyszukania
        element.sendKeys(products[randomInteger]);


        // Prześlij formularz
        element.submit();


    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
       // driver.quit();
    }
}






