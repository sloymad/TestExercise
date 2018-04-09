import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveToImagesSearch extends TestBase {

    @Test
    public void checkTheLatestResult() {
        googlePage.startSearch("Selenide");
        searchResultPage.checkTopResult();
        searchResultPage.moveToImagesSearch();
        //searchByImagePage.searchSelenideLogo();
        assertEquals("Лого присутствует:", searchByImagePage.searchSelenideLogo(), false);

    }

}
