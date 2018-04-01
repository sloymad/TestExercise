import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SearchImageTest {
    private WebDriver driver;
    private SearchByImagePage searchByImagePage;
    private GooglePage googlePage;
    private SearchResultPage searchResultPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/distillery/Desktop/java/testselenium/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/ncr");
        searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        searchByImagePage = PageFactory.initElements(driver, SearchByImagePage.class);
        googlePage = PageFactory.initElements(driver, GooglePage.class);
    }


    @Test
    public void clickOnImage(){
        SearchResultPage searchResultList = googlePage.startSearch("Selenide");
        SearchByImagePage moveToImagePage = searchResultPage.moveToImagesSearch();
        SearchByImagePage clickOnFirstImage = searchByImagePage.searchSelenideLogo();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
