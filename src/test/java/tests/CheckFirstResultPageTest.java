package tests;

import helpers.TestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Feature("Поиск")
@Story("Результаты поиска")
public class CheckFirstResultPageTest extends TestBase  {

    @Test(testName = "Получаю логотип суленид")
    public void checkTheTopResultOfSearch() {
        googlePage.startSearch("Selenide");
        searchResultPage.checkTopResult();
        assertEquals(searchResultPage.checkTopResult(), true, "Логотип Selenide");
    }

}
