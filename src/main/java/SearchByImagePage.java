import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchByImagePage {
    WebDriver driver;

    public SearchByImagePage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "(//IMG[@class='rg_ic rg_i'])[1]")
    private WebElement logoOfTheSelenide;
    @FindBy(xpath = "//a[@class='q qs'][text()='All']")
    private WebElement allResultButton;


    public SearchByImagePage searchSelenideLogo(){
        logoOfTheSelenide.click();
        return new SearchByImagePage(driver);
        }

    public SearchResultPage backToResultList(){
        allResultButton.click();
        return new SearchResultPage(driver);
    }



}
