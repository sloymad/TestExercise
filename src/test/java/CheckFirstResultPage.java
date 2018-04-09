import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckFirstResultPage extends TestBase {

    @Test
    public void CheckTheTopResultOfSearch() {
        googlePage.startSearch("Selenide");
        searchResultPage.checkTopResult();
        assertEquals("Вернул не TRUE:", searchResultPage.checkTopResult(), true);

    }

}
