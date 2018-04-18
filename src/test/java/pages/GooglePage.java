package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GooglePage{
    private WebDriver driver;


    @FindBy(xpath = "//input[@id='lst-ib']")
    private WebElement searchField;

    @Step("Начало поиска")
    public void startSearch (String keyword){
        searchField.sendKeys(keyword);
        searchField.sendKeys(Keys.ENTER);
    }

    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



}

