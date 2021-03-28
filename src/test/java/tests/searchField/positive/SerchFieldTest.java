package tests.searchField.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.SearchField.validValue;
import static constants.Constant.URLs.mainPageUkrNet;

public class SerchFieldTest extends BaseTest {
    @Test
    public void enterValidValue(){
        searchField.goToUrl(mainPageUkrNet);
        searchField.enterValidValueInSearchField(validValue);
        searchField.pressButtonSubmit();
        driver.close();
    }
}
