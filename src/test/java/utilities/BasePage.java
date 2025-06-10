package utilities;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

import static constants.StringConstants.*;


@Slf4j
public class BasePage extends BaseTest {
    WebDriverWait wait;

    public BasePage() {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public BasePage(AppiumDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }


    public void sendKeys(String text, By locator) {
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys(text);

    }

    public void assertStringContainsSubstring(String text, String subtext) {
        Assert.assertTrue(text.toLowerCase().contains(subtext.toLowerCase()));
    }


    protected void waitUntilElementIsClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static boolean isElementDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static void verifyPopupMessage(By locator, String expectedMessage) {
        try {
            WebElement popup = driver.findElement(locator);
            String actualMessage = popup.getText();

            if (actualMessage.contains(expectedMessage)) {
                log.info("Popup message is as expected: " + actualMessage);
            } else {
                log.error("Popup message is not as expected. Expected: " + expectedMessage + ", Actual: " + actualMessage);
            }
        } catch (Exception e) {
            log.info("An error occurred: " + e.getMessage());
        }
    }

    public static void toggleCheckbox(By locator) {

        WebElement checkbox = driver.findElement(locator);
        if (checkbox.isSelected()) {
            log.info("Checkbox already selected, passing without click.");
        } else {
            checkbox.click();
            log.info("Checkbox clicked.");
        }
    }

    public static void toggleSelection(By locator, boolean shouldSelect) {
        WebElement checkbox = driver.findElement(locator);
        if (shouldSelect) {
            if (!checkbox.isSelected()) {
                checkbox.click();
                log.info("Checkbox selected.");
            } else {
                log.info("Checkbox already selected, passing without click.");
            }
        } else {
            if (checkbox.isSelected()) {
                checkbox.click();
                log.info("Checkbox selection canceled.");
            } else {
                log.info("Checkbox already deselected, passing without click.");
            }
        }
    }


    public void clickClickableElement(By locator) {
        waitUntilElementIsClickable(locator);
        findElement(locator).click();
    }

    public void clickClearElement(By locator) {
        waitUntilElementIsClickable(locator);
        findElement(locator).clear();
    }

    public static void post() throws Exception {
        String url = System.getenv("DOPI_URL");
        var uri = URI.create(url);
        String token = System.getenv("DOPI_TOKEN");
        var client = HttpClient.newHttpClient();
        var jsonBody = BODY_INFORMATION;
        var request = HttpRequest.newBuilder()
                .uri(uri)
                .timeout(Duration.ofMinutes(1))
                .header(CONTENTS, JSON_APPLICATION)
                .header(API_KEY, token)
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        log.info("Response Code: " + response.statusCode());
        log.info("Response Body: " + response.body());
    }

    public boolean isElementClickable(By by) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions.elementToBeClickable(by));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void clickClickableElement(By by, String msg) {
        assertTrue(isElementClickable(by), msg);
        findElement(by).click();
    }

    public void verifyTextControl(By by, String msg, String text) {
        assertTrue(isElementClickable(by), msg);
        WebElement textLocator = driver.findElement(by);
        String actualText = textLocator.getText();
        if (actualText.contains(text)) {
            log.info("Popup message is as expected: " + actualText);
        } else {
            log.error("Popup message is not as expected. Expected: " + text + ", Actual: " + actualText);
        }
    }


    protected WebElement findElement(By locator) {
        waitUntilElementIsVisible(locator);
        return driver.findElement(locator);
    }

    public void waitAndClickElement(By by) {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(15)))
                .until(ExpectedConditions.elementToBeClickable(by));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    protected List<WebElement> findElements(By locator) {
        waitUntilAllElementsAreVisible(locator);
        return driver.findElements(locator);
    }

    protected boolean waitUntilElementIsVisible(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    protected String getText(By locator) {
        return findElement(locator).getText();
    }

    protected void waitUntilAllElementsAreVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void assertTrue(boolean assertion, String message) {
        if (!assertion) {
            throw new AssertionError(message);
        }
    }

    public void assertFalse(boolean assertion, String message) {
        if (assertion) {
            throw new AssertionError(message);
        }
    }

    public void assertEquals(String actual, String expected, String message) {
        if (!actual.equals(expected)) {
            throw new AssertionError(message + ". Expected: " + expected + ", Actual: " + actual);
        }
    }

    public void scroll(By locator, ScrollDirection dir, double scrollRatio) {
        Duration SCROLL_DUR = Duration.ofMillis(200);
        Point midPoint;
        Dimension size;

        if (scrollRatio < 0 || scrollRatio > 1) {
            throw new Error("Scroll distance must be between 0 and 1");
        }

        if (driver.findElements(locator).isEmpty()) {
            size = driver.manage().window().getSize();
            midPoint = new Point((int) (size.width * 0.5), (int) (size.height * 0.5));

        } else { //entire screen is scrollable
            midPoint = getCenter(findElement(locator));
        }

        int bottom = midPoint.y + (int) (midPoint.y * scrollRatio);
        int top = midPoint.y - (int) (midPoint.y * scrollRatio);
        int left = midPoint.x - (int) (midPoint.x * scrollRatio);
        int right = midPoint.x + (int) (midPoint.x * scrollRatio);

        if (dir == ScrollDirection.UP) {
            swipe(new Point(midPoint.x, top), new Point(midPoint.x, bottom), SCROLL_DUR);
        } else if (dir == ScrollDirection.DOWN) {
            swipe(new Point(midPoint.x, bottom), new Point(midPoint.x, top), SCROLL_DUR);
        } else if (dir == ScrollDirection.LEFT) {
            swipe(new Point(left, midPoint.y), new Point(right, midPoint.y), SCROLL_DUR);
        } else if (dir == ScrollDirection.RIGHT) {
            swipe(new Point(right, midPoint.y), new Point(left, midPoint.y), SCROLL_DUR);
        }
    }

    protected void swipe(Point start, Point end, Duration duration) {

        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipe = new Sequence(input, 0);
        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(ImmutableList.of(swipe));
    }

    private Point getCenter(WebElement el) {
        Point location = el.getLocation();
        Dimension size = el.getSize();
        return new Point(location.x + size.getWidth() / 2, location.y + size.getHeight() / 2);
    }

    public enum ScrollDirection {
        UP, DOWN, LEFT, RIGHT,
    }

    public void scrollClick() {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.25);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));
    }

    public void scrollElement(By locator, ScrollDirection dir, double scrollRatio) {
        Duration SCROLL_DUR = Duration.ofMillis(300);
        Point midPoint = null;
        Dimension size;

        if (scrollRatio < 0 || scrollRatio > 1) {
            throw new Error("Scroll distance must be between 0 and 1");
        }

        if (!driver.findElements(locator).isEmpty()) {
            midPoint = getCenter(findElement(locator));

        }

        int bottom = midPoint.y + (int) (midPoint.y * scrollRatio);
        int top = midPoint.y - (int) (midPoint.y * scrollRatio);
        int left = midPoint.x - (int) (midPoint.x * scrollRatio);
        int right = midPoint.x + (int) (midPoint.x * scrollRatio);

        if (dir == ScrollDirection.UP) {
            swipe(new Point(midPoint.x, top), new Point(midPoint.x, bottom), SCROLL_DUR);
        } else if (dir == ScrollDirection.DOWN) {
            swipe(new Point(midPoint.x, bottom), new Point(midPoint.x, top), SCROLL_DUR);
        } else if (dir == ScrollDirection.LEFT) {
            swipe(new Point(left, midPoint.y), new Point(right, midPoint.y), SCROLL_DUR);
        } else if (dir == ScrollDirection.RIGHT) {
            swipe(new Point(right, midPoint.y), new Point(left, midPoint.y), SCROLL_DUR);
        }
    }

}
