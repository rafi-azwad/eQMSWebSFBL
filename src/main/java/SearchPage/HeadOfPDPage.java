package SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static SearchPage.CustomerComplaintsPage.complaintNo;

public class HeadOfPDPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public HeadOfPDPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;

    }


    public void clickOnHeadOfPD()  {

        WebElement headOfPD = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Head of PD')]")));
        js.executeScript("arguments[0].click()", headOfPD);
    }

    public void selectRefNo() throws InterruptedException {

        Select refNo = new Select(driver.findElement(By.name("COMPLAINT_NO")));
        System.out.println("Complaint Number: "+complaintNo);
        Thread.sleep(2000);
        refNo.selectByValue(complaintNo);

    }
    public void comment(){
        WebElement comment = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.id("COMMENTS")));
       comment.sendKeys("abcde");
    }
   public void saveAndSubmit(){
        WebElement save = wait.
           until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save')]")));
       js.executeScript("arguments[0].click()", save);

       WebElement submit = wait.
               until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
       js.executeScript("arguments[0].click()",submit);
    }

}
