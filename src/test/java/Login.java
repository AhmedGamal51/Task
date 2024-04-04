import org.openqa.selenium.By;

public class Login {
    public By userEmail = By.id("email");
    public By userPassword = By.id("password");
    public By login = By.id("submitBTN");
    public By loginMsg =By.xpath("//div[@class='text-group']/p");

    public void setUserEmail(String email){
        TestLogin.driver.findElement(userEmail).sendKeys(email);
    }
    public void setUserPassword(String password){
        TestLogin.driver.findElement(userPassword).sendKeys(password);
    }
    public void clickLoginBtn(){
        TestLogin.driver.findElement(login).click();
    }
    public Boolean getLoginMsg(){
        TestLogin.driver.findElement(loginMsg);
        return true;
    }
}
