package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeOutVariables.EXPLICITY_WAIT;
import static constants.Constant.TimeOutVariables.IMPLICITY_WAIT;

public class BasePage {
     public  WebDriver driver;

     public BasePage(WebDriver driver){
         this.driver = driver;
     }

     public void goToUrl(String url){
         driver.get(url);
     }

    public WebElement webElementIsVisible(WebElement element){
         new WebDriverWait(driver,EXPLICITY_WAIT).until(ExpectedConditions.visibilityOf(element));
         return element;
    }

   /* public void isAuthWidgetPresent(){
         WebElement aaa = driver.findElement();
         webElementIsVisible();
    }*/


}
