import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestCases extends TestBase{
    //WebDriver driver;
    @Test
    public void testLoginSuccess(){
       testLoginPage().loginToOHRM();
    }
}
