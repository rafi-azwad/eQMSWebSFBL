package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void userNameAndPassword(String userName, String password) {
       WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("UserName")));
       name.sendKeys(userName);
       WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Password")));
       pass.sendKeys(password);

    }

    public void loginButton() {

        WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sign In']")));
        login.click();
    }

    public void successfullyLogin()  {

        String expect = "Customer Complaint Management System";
        WebElement webElement = driver.findElement(By.xpath("//h1[text()='Customer Complaint Management System']"));
        String actual = webElement.getText();

        //Assert.assertEquals(actual,expect,"login failed");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual,expect,"Login failed");

        System.out.println("Successfully login -->>>>");

        softAssert.assertAll();
    }

    }




