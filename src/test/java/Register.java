import org.openqa.selenium.By;

public class Register {
    public By firstName = By.id("firstname");
    public By lastName = By.id("last_name");
    public By phone = By.id("phone");
    public By email = By.id("user_email");
    public By password = By.id("password");
    public By recaptchaCheckBox = By.xpath("//div[@class='recaptcha-checkbox-spinner']");
    public By signUp =By.id("submitBTN");
    public By dropDown = By.xpath("//div[@class='filter-option']");
    public By selectContry = By.xpath("//input[@type='search']");
    public By chooseOption = By.xpath("//span[@class='text']");

    public void setFirstName(String fName){
        TestRegister.driver.findElement(firstName).sendKeys(fName);
    }
    public void setLastName(String lName){
        TestRegister.driver.findElement(lastName).sendKeys(lName);
    }
    public void setEmailAddress(String emailAddress){
        TestRegister.driver.findElement(email).sendKeys(emailAddress);
    }
    public void setPassword(String pass){
        TestRegister.driver.findElement(password).sendKeys(pass);
    }
    public void clickReCaptcha(){
        TestRegister.driver.findElement(recaptchaCheckBox).click();
    }
    public void clickSignUp(){
        TestRegister.driver.findElement(signUp).click();
    }
    public void setSelectContry(String country) {
        TestRegister.driver.findElement(dropDown).click();
        TestRegister.driver.findElement(selectContry).sendKeys(country);
        TestRegister.driver.findElement(chooseOption).click();
    }
    public void setPhone(String phoneNum){
        TestRegister.driver.findElement(phone).sendKeys(phoneNum);
    }
}
