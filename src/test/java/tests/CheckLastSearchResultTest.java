package tests;

import helpers.TestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import listeners.EventListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Feature("Проверка поиска")
@Story("Проверка результатов поиска")
public class CheckLastSearchResultTest extends TestBase {

    @Test(testName = "Получаю результат поиска")
    public void checkTheLatestResult() {
        googlePage.startSearch("Selenide");
        searchResultPage.checkTopResult();
        searchResultPage.moveToImagesSearch();
        // searchByImagePage.searchSelenideLogo();
        searchByImagePage.backToResultList();
        assertEquals(searchResultPage.checkTopResult(), true, "Вернул не TRUE:");
    }
}

