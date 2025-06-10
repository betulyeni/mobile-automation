package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public static AppiumDriver driver;
    public ExtentReports extent;
    public ExtentSparkReporter reporter;
    public ExtentTest  logger;

    @BeforeSuite
    public void beforeSuite() {
        extent = new ExtentReports();
        reporter = new ExtentSparkReporter("./reports/"+ System.currentTimeMillis() +".html");
        extent.attachReporter(reporter);
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        UiAutomator2Options cap = new UiAutomator2Options();

        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "com.dopinghafiza.mobile.app");
        cap.setCapability("appActivity", "com.dopinghafiza.mobile.app.MainActivity");
        cap.setCapability("waitForIdleTimeout", 5000);
        cap.setCapability("appium:ensureWebviewsHavePages", true);
        cap.setCapability("appium:nativeWebScreenshot", true);
        cap.setCapability("appium:newCommandTimeout", 3600);
        cap.setCapability("appium:connectHardwareKeyboard", true);
        cap.setCapability("autoGrantPermissions", true);
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        logger = extent.createTest(method.getName());
        logger.info("Driver has been initialized and the test has started.");
    }


    @AfterMethod
    public void afterTest() {
        if (driver!=null) {

            try {
                driver.quit();
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE) {
            logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromBase64String(driver.getScreenshotAs(OutputType.BASE64)).build());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
            logger.info("Test succeeded.");
        }
    }

    @AfterSuite
    public void afterSuite() {
        extent.flush();
    }
}