package tests.base;

import io.qameta.allure.Attachment;
import org.codehaus.plexus.util.FileUtils;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Listener implements TestWatcher {
    private static final Logger logger = LoggerFactory.getLogger(Listener.class);
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        logger.info("Test{} - FAILED!", context.getTestMethod().get().getName());
        String ScreenShotName = context.getTestMethod()
                .get().getName()
                + String.valueOf(System.currentTimeMillis())
                .substring(9, 13);
        logger.info("Trying to trace ScreenShot...");
        TakesScreenshot ts = (TakesScreenshot) ((BaseTest) context.getRequiredTestInstance()).driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File("build/reports/tests/" + ScreenShotName + ".png"));
        } catch (Exception e) {
            logger.info("Exception on saving screenshot");
            e.printStackTrace();
        }
    attachmentScreenshotToAllureReport(ts);
    }
     @Attachment
    public byte[] attachmentScreenshotToAllureReport(TakesScreenshot takesScreenshot){
        return takesScreenshot.getScreenshotAs(OutputType.BYTES);
     }
}


