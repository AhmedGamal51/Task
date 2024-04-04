import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRegister {
    public static WebDriver driver;
    Register register;
    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();
        driver.navigate().to("https://phptravels.net/signup");
        register = new Register();
    }
    @Test
    public void testRegister() throws InterruptedException {
        register.setFirstName("Ahmed");
        register.setLastName("Gamal");
        register.setSelectContry("egypt");
        register.setPhone("01100648812");
        register.setEmailAddress("ahmedgamalalden51@gmail.com");
        register.setPassword("Aa123456789");
        Thread.sleep(8000);
        register.clickSignUp();
    }
    @AfterTest
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
