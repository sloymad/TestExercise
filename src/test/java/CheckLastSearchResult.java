import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CheckLastSearchResult extends TestBase {

    @Test
    public void checkTheLatestResult() {
        googlePage.startSearch("Selenide");
        searchResultPage.checkTopResult();
        searchResultPage.moveToImagesSearch();
       // searchByImagePage.searchSelenideLogo();
        searchByImagePage.backToResultList();
        assertEquals("Вернул не TRUE:", searchResultPage.checkTopResult(), true);
    }
}

