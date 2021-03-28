package pages.email_field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Email.emailLogin;
import static constants.Constant.Email.emailPassword;

public class EmailButtonUnit extends BasePage {


    public EmailButtonUnit(WebDriver driver) {
        super(driver);
    }

    private final By fieldInputEmail = By.xpath("//input[@id='id-input-login']");
    private final By fieldInputPassword = By.xpath("//input[@id='id-input-password']");
    private final By buttonSubmit = By.xpath("//article/section/h2/a");









    //enter login for email
/*    public EmailButtonUnit enterEmailLogin(String login){
        driver.findElement(fieldInputEmail).sendKeys(login);//click();
        return this;
    }
    // enter password for email
    public EmailButtonUnit enterEmailPassword(String password){
        driver.findElement(fieldInputPassword).sendKeys(password);
        return this;
    }
    //press button submit
    public EmailButtonUnit pressButtonEmailSubmit(){
        driver.findElement(buttonSubmit).click();
        return this;
    }*/


}
