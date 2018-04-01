import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage{
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//input[@id='lst-ib']")
    public WebElement searchField;

    public SearchResultPage startSearch (String keyword){
        searchField.sendKeys(keyword);
        searchField.sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }

   // public GooglePage startSearch (){
   //     searchField.sendKeys(Keys.ENTER);
   //     return new GooglePage(driver);
   // }




}

