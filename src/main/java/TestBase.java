import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

abstract class TestBase {
    private InitDriver initDriver = new InitDriver();
    private WebDriver driver = initDriver.chromeDriver();
    public GooglePage googlePage;
    public SearchByImagePage searchByImagePage;
    public SearchResultPage searchResultPage;

    @Before
    public void setUp(){
        googlePage = new GooglePage(driver);
        searchByImagePage = new SearchByImagePage(driver);
        searchResultPage = new SearchResultPage(driver);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void closeUp(){
        driver.close();
    }
}
