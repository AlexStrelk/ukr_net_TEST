package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeOutVariables.EXPLICITY_WAIT;
import static constants.Constant.TimeOutVariables.IMPLICITY_WAIT;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By visibleElementSinoptikPage = By.xpath("//h1[strong='Погода']");
    public final By visibleElementOrakulPage_Goroskopi = By.xpath("//a[text()=\"Гороскопы\"]");
    public final By visibleElement_TV_PROGRAMA = By.xpath("//span[text()=\"ТВ ПРОГРАМА\"]");
    public final By visibleElement_Kinoafisha = By.xpath("//p/span[text()=\"Сьогодні\"]");
    public final By visibleElement_Booking = By.xpath("//*[contains(text(),'Найдите спецпредложения для отелей, домов и других вариантов')]");
    public final By visibleElement_Rozetka = By.xpath("//picture/img[contains(text(),Rozetka)]");
    public final By visibleElement_Kasta = By.xpath("//div/a/img[contains(text(),Kasta)]");
    public final By visibleElement_Citrus = By.xpath("//*[contains(@src,'//i.citrus.ua/pictures/all/svg/citrus_brand_new_logo.svg')]");
    public final By visibleElement_Make_Up =By.xpath("//*[contains(@title,'MAKEUP')]");
    public final By visibleElement_Ukrzoloto =By.xpath("//*[contains(@src,\"/images/logo.svg\")]");

    public void goToUrl(String url) {
        driver.get(url);
    }


    public WebElement webElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICITY_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void isElementPogodaPresent() {
        WebElement webElement = driver.findElement(visibleElementSinoptikPage);
        webElementIsVisible(webElement);
    }

    public void isElementOrakul_Goroskopi_Present() {
        WebElement webElement = driver.findElement(visibleElementOrakulPage_Goroskopi);
        webElementIsVisible(webElement);
    }
    public void isElementTVProgramaPresent() {
        WebElement webElement = driver.findElement(visibleElement_TV_PROGRAMA);
        webElementIsVisible(webElement);
    }
    public void isElementKinoafishaPresent() {
        WebElement webElement = driver.findElement(visibleElement_Kinoafisha);
        webElementIsVisible(webElement);
    }
    public void isElementBookingPresent() {
        WebElement webElement = driver.findElement(visibleElement_Booking);
        webElementIsVisible(webElement);
    }
    public void isElementRozetkaPresent() {
        WebElement webElement = driver.findElement(visibleElement_Rozetka);
        webElementIsVisible(webElement);
    }
    public void isElementKastaPresent() {
        WebElement webElement = driver.findElement(visibleElement_Kasta);
        webElementIsVisible(webElement);
    }
    public void isElementCitrus() {
        WebElement webElement = driver.findElement(visibleElement_Citrus);
        webElementIsVisible(webElement);
    }
    public void isElementMakeUpPresent() {
        WebElement webElement = driver.findElement(visibleElement_Make_Up);
        webElementIsVisible(webElement);
    }
    public void isElementUkrzolotoPresent() {
        WebElement webElement = driver.findElement(visibleElement_Ukrzoloto);
        webElementIsVisible(webElement);
    }
}