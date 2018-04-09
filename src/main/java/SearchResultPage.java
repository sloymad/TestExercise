import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@FindBy(id = "rso")
public class SearchResultPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id='rso']//h3/a")
    private List<WebElement> firstTopResult;

    @FindBy(linkText = "Картинки")
    private WebElement imagesButton;


    public void moveToImagesSearch() {
        imagesButton.click();
    }

    public boolean checkTopResult() {
       return firstTopResult.get(0).getText().contains("Selenide");
    }

    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }




}
