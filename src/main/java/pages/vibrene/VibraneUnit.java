package pages.vibrene;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.util.Set;

public class VibraneUnit extends BasePage {
    public VibraneUnit(WebDriver driver) {
        super(driver);
    }

    private final By buttonSinoptic = By.xpath("//a[@href='https://ua.sinoptik.ua/']");
    private final By buttonOrakul = By.xpath("//a[@href='http://orakul.com']");
    private final By buttonTvGit = By.xpath("//a[@class='a2']");
    private final By buttonKinoAfisha = By.xpath("//a[@class='a3']");
    private final By buttonBooking = By.xpath("//a[@class='a4']");
    private final By buttonRozetka = By.xpath("//div[@class=\"right\"]/a[@class=\"a0\"]");
    private final By buttonKaste = By.xpath("//div[@class=\"right\"]/a[@class=\"a1\"]");
    private final By buttonCitrus = By.xpath("//div[@class=\"right\"]/a[@class=\"a2\"]");
    private final By buttonMakeUp = By.xpath("//div[@class=\"right\"]/a[@class=\"a3\"]");
    private final By buttonUkrZoloto = By.xpath("//div[@class=\"right\"]/a[@class=\"a4\"]");


    public VibraneUnit clickButtonSinoptic(){
        driver.findElement(buttonSinoptic).click();
        return this;
    }
    public VibraneUnit clickButtonOrakul(){
        driver.findElement(buttonOrakul).click();
        return this;
    }
    public VibraneUnit clickButtonTvGid(){
        driver.findElement(buttonTvGit).click();
        return this;
    }
    public VibraneUnit clickButtonKinoafisha(){
        driver.findElement(buttonKinoAfisha).click();
        return this;
    }
    public VibraneUnit clickButtonBooking(){
        driver.findElement(buttonBooking).click();
        return this;
    }
    public VibraneUnit clickButtonRozetka(){
        driver.findElement(buttonRozetka).click();
        return this;
    }
    public VibraneUnit clickButtonKasta(){
        driver.findElement(buttonKaste).click();
        return this;
    }
    public VibraneUnit clickButtonCitrus(){
        driver.findElement(buttonCitrus).click();
        return this;
    }
    public VibraneUnit clickButtonMakeUp(){
        driver.findElement(buttonMakeUp).click();
        return this;
    }
    public VibraneUnit clickButtonUkrZoloto(){
        driver.findElement(buttonUkrZoloto).click();
        return this;
    }
}


