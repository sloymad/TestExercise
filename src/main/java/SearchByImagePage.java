import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchByImagePage {
    private WebDriver driver;

    @FindBy(xpath = "(//IMG[@class='rg_ic rg_i'])[1]")
    private WebElement logoOfTheSelenide;

    @FindBy(xpath = "//a[@class='q qs'][text()='Все']")
    private WebElement allResultButton;


    public boolean searchSelenideLogo(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       return logoOfTheSelenide.getText().contains("Selenide");
    }

    public void backToResultList(){
        allResultButton.click();
    }

    public SearchByImagePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


}
