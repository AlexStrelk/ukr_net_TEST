package tests.base;

import common.CommonActions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;


public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);


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
