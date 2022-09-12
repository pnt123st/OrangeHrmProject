package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    WebDriver driver;

    public void setdriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
