package pages.searchField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.SearchField.validValue;

public class SearchField extends BasePage {
    public SearchField(WebDriver driver) {
        super(driver);
    }

    private final By searchField = By.xpath("//input[@name='q']");
    private final By buttonSubmit = By.xpath("//input[@type='submit']");

    //inter valid value 'крассная икра'
    public SearchField enterValidValueInSearchField(String text) {
        driver.findElement(searchField).sendKeys(text);
        return this;
    }

      public SearchField pressButtonSubmit() {
        driver.findElement(buttonSubmit).click();
        return this;
    }
}
