package support;

import definitions.hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class util extends hooks{
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    public util(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30000));
        js=(JavascriptExecutor) driver;
    }
}
