package SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static SearchPage.CustomerComplaintsPage.complaintNo;

public class RCAndCAPATeamPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public RCAndCAPATeamPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }
    public void clickOnRCAndCAPA()  {
        WebElement rcAndCAPA = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'RC & CAPA TEAM')]")));
        js.executeScript("arguments[0].click()", rcAndCAPA);
    }
    public void selectRefNO() throws InterruptedException {
        WebElement ref = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("COMPLAINT_NO")));

        Select refNo = new Select(ref);
        System.out.println("Complaint Number: "+complaintNo);
        Thread.sleep(2000);
        refNo.selectByValue(complaintNo);



    }
    public void selectStatus(){
        Select status = new Select(driver.findElement(By.name("STATUS")));
        status.selectByVisibleText("Justified Control");
    }

    public void rootCause(){

        WebElement plusIcon = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='plus-button']")));
        js.executeScript("arguments[0].click()",plusIcon);

        WebElement name = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.name("NAME")));
        js.executeScript("arguments[0].click()",name);
        name.sendKeys("Rafi");

        WebElement cause = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.name("CAUSE")));
        js.executeScript("arguments[0].click()",cause);
        cause.sendKeys("No Cause");

    }
    public void complainControlType() {

        Select complainControl = new Select(driver.findElement(By.name("Complaint_Control_Type")));
        complainControl.selectByVisibleText("Administrative Control");
    }
    public void saveAndSubmit() {

        WebElement save = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save')]")));
        js.executeScript("arguments[0].click()", save);

        WebElement submit = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
        js.executeScript("arguments[0].click()",submit);
    }

    }

