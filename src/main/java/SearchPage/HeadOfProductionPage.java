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

public class HeadOfProductionPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public HeadOfProductionPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;

    }

    public void clickOnHeadOfProduction()  {

        WebElement headOfProduction = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Head of Production')]")));
        js.executeScript("arguments[0].click()", headOfProduction);
    }
    public void selectRefNo() throws InterruptedException {
        WebElement ref = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.name("COMPLAINT_NO")));

        Select refNo = new Select(ref);
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
