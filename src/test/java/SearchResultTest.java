import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SearchResultTest {

    private WebDriver driver;
    private GooglePage googlePage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/distillery/Desktop/java/testselenium/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/ncr");
        //googlePage = new GooglePage(driver);
        googlePage = PageFactory.initElements(driver, GooglePage.class);
    }

    @Test
    public void searchResultTest(){
        SearchResultPage searchResultPage = googlePage.startSearch("Selenide");
        String result = searchResultPage.getTopResult();
        Assert.assertEquals("Selenide: concise UI tests in Java", result);
        }




    @After
    public void tearDown(){
        driver.quit();
    }



}
