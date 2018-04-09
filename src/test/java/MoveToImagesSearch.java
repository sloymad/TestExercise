import org.junit.Test;

public class MoveToImagesSearch extends TestBase {

    @Test
    public void checkTheLatestResult() {
        googlePage.startSearch("Selenide");
        searchResultPage.checkTopResult();
        searchResultPage.moveToImagesSearch();
        searchByImagePage.searchSelenideLogo();
    }

}
