import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage {

    WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public By firstTopResult = By.xpath("//*[@id='rso']//h3/a");
    @FindBy(xpath = "//a[@class='q qs'][text()='Images']")
    private WebElement imagesButton;



    public SearchByImagePage moveToImagesSearch(){
        imagesButton.click();
        return new SearchByImagePage(driver);
    }

    public String getTopResult() {
        List<WebElement> findElements = driver.findElements(firstTopResult);
      // String first_link = findElements.get(0).getAttribute("href");
       String text_link = findElements.get(0).getText();
        //return first_link;
        return text_link;

    }




}
