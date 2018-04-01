import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    public static void main (String[] args) {

        System.setProperty("webdriver.gecko.driver", "/Users/distillery/Desktop/java/testselenium/Drivers/geckodriver 3");
        System.setProperty("webdriver.chrome.driver", "/Users/distillery/Desktop/java/testselenium/Drivers/chromedriver");


        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/ncr");

        //GooglePage googlePage = new GooglePage(driver);
        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);
        //SearchResultPage searchResultPage = new SearchResultPage(driver);
        SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        //SearchByImagePage searchByImagePage = new SearchByImagePage(driver);
        SearchByImagePage searchByImagePage = PageFactory.initElements(driver, SearchByImagePage.class);

       // googlePage.enterSearchName("selenide");
        googlePage.startSearch("selenide");
        System.out.println(searchResultPage.getTopResult());
        searchResultPage.moveToImagesSearch();

        searchByImagePage.searchSelenideLogo();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        searchByImagePage.backToResultList();
        System.out.println(searchResultPage.getTopResult());



    }
}
