import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLogin {
    public static WebDriver driver;
    Login login;
    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();
        driver.navigate().to("https://phptravels.net/login");
        login = new Login();
    }
    @Test
    public void testRegister() {
        login.setUserEmail("ahmedgamalalden51@gmail.com");
        login.setUserPassword("Aa123456789");
        login.clickLoginBtn();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(login.getLoginMsg());
    }
    @AfterTest
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
