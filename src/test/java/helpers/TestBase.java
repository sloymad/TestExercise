package helpers;

import listeners.EventListener;
import listeners.RetryAnalyzer;
import listeners.RetryListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.GooglePage;
import pages.SearchByImagePage;
import pages.SearchResultPage;

import java.util.concurrent.TimeUnit;

@Listeners({EventListener.class, RetryListener.class})
public abstract class TestBase {
    private InitDriver initDriver = new InitDriver();
    private WebDriver driver = initDriver.chromeDriver();
    public GooglePage googlePage;
    public SearchByImagePage searchByImagePage;
    public SearchResultPage searchResultPage;

    @BeforeMethod
    public void setUp(){
        googlePage = new GooglePage(driver);
        searchByImagePage = new SearchByImagePage(driver);
        searchResultPage = new SearchResultPage(driver);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void closeUp(){
        driver.close();
    }
}
