package tests.vibrane.positive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;
import java.util.ArrayList;
import static constants.Constant.URLs.*;


public class VibraneUnitTest extends BaseTest {

    @Test
    public void checkButtonSinoptik001() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonSinoptic();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementPogodaPresent();

        String currentUrl = driver.getCurrentUrl();

        Assertions.assertEquals(SinopticUrl, currentUrl);

        driver.close();
        driver.switchTo().window(oldTab);

    }

    @Test
    public void checkButtonOracul002() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonOrakul();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementOrakul_Goroskopi_Present();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(OrakulUrl, currentUrl);
        driver.close();
        driver.switchTo().window(oldTab);
    }

    @Test
    public void checkButtontvGit003() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonTvGid();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementTVProgramaPresent();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(TV_GitUrl, currentUrl);
        driver.close();
        driver.switchTo().window(oldTab);
    }

    @Test
    public void checkButtonkinoafishat004() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonKinoafisha();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementKinoafishaPresent();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(KinoafishaUrl, currentUrl);
        driver.close();
        driver.switchTo().window(oldTab);
    }
    @Test
    public void checkButtonBookingt005() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonBooking();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementBookingPresent();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(BookingUrl,currentUrl);
        driver.close();
        driver.switchTo().window(oldTab);
    }
    @Test
    public void checkButtonRozetka006() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonRozetka();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementRozetkaPresent();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(RozetkaUrl,currentUrl);
        driver.close();
        driver.switchTo().window(oldTab);
    }

    @Test
    public void checkButtonKasta007() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonKasta();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementKastaPresent();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(KastaUrl,currentUrl);
        driver.close();
        driver.switchTo().window(oldTab);
    }

    @Test
    public void checkButtonCitrus008() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonCitrus();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementCitrus();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(CitrusUrl,currentUrl);
        driver.close();
        driver.switchTo().window(oldTab);
    }
    @Test
    public void checkButtonMakeUp009() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonMakeUp();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementMakeUpPresent();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(MakeUrl,currentUrl);
        driver.close();
        driver.switchTo().window(oldTab);
    }

    @Test
    public void checkButtonUkrZoloto010() {
        vibraneUnit.goToUrl(mainPageUkrNet);
        String oldTab = driver.getWindowHandle();
        vibraneUnit.clickButtonUkrZoloto();
        //switch to other window, check and return
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        vibraneUnit.isElementUkrzolotoPresent();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(UkrzolotoUrl,currentUrl);
        driver.close();
        driver.switchTo().window(oldTab);
    }
}
