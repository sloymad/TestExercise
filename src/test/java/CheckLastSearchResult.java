import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CheckLastSearchResult {
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
    public void checkTheLatestResult(){
        SearchResultPage searchResultList = googlePage.startSearch("Selenide");
        SearchByImagePage moveToImageList = searchResultPage.moveToImagesSearch();
        SearchByImagePage clickOnImage = searchByImagePage.searchSelenideLogo();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SearchResultPage backToallresults = searchByImagePage.backToResultList();
        String result = searchResultPage.getTopResult();
        Assert.assertEquals("Selenide: concise UI tests in Java", result);
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}

