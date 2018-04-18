package tests;

import helpers.TestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Feature("Поиск")
@Story("Поторные результаты поиска")
@Test(groups = {"search"})
public class MoveToImagesSearchTest extends TestBase {

    @Test(testName = "Сравниваю результат снова")
    public void checkTheLatestResult() {
        googlePage.startSearch("Selenide");
        searchResultPage.checkTopResult();
        searchResultPage.moveToImagesSearch();
        searchByImagePage.searchSelenideLogo();
        assertTrue(searchByImagePage.searchSelenideLogo(), "Лого присутствует:");
    }
}
