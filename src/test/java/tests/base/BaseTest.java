package tests.base;

import common.CommonActions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.email_field.EmailButtonUnit;
import pages.searchField.SearchField;
import pages.vibrene.VibraneUnit;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;
@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected EmailButtonUnit emailButtonUnit = new EmailButtonUnit(driver);
    protected VibraneUnit vibraneUnit = new VibraneUnit(driver);
    protected SearchField searchField = new SearchField(driver);

    private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    static {
        logger.info("Start time" + LocalTime.now());
        logger.info("Start clear reports dir: build/reports...");
        File allure_results = new File("allure-results");
        if (allure_results.isDirectory()) {
            for (File item : Objects.requireNonNull(allure_results.listFiles()))
                item.delete();
        }
    }

    @AfterEach
    void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }
    @AfterAll
    void close(){
      if(!HOLD_BROWSER_OPEN){
        driver.close();
      }
    }
}
