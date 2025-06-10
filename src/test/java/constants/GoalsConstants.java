package constants;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class GoalsConstants {
    public static By CREATE_GOALS = AppiumBy.xpath("//android.widget.TextView[@text=\"Hedeflerini Belirle\"]\n");
    public static By GOALS_TITLE = AppiumBy.xpath("(//android.widget.TextView[@text=\"Hedeflerim\"])[2]\n");


}

