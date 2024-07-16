package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static SearchPage.CustomerComplaintsPage.complaintNo;

public class MarketingRepresentativePage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    CustomerComplaintsPage cc;
    public MarketingRepresentativePage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }

    public void selectMarketing(){
        WebElement marketing = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Marketing/IMD Representative')]")));
        js.executeScript("arguments[0].click()", marketing);
    }
    public void selectRefNO() throws InterruptedException {
        WebElement ref = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("COMPLAINT_NO")));

        Select refNo = new Select(ref);
        System.out.println("Complaint Number: "+complaintNo);
        Thread.sleep(2000);
        refNo.selectByValue(complaintNo);

    }
    public void assessmentComment(){
        WebElement comment = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.id("ASSESMENT_COMMENT")));
        comment.sendKeys("abcd");

    }

    public void selectFurtherStatus()  {
        Select status = new Select(driver.findElement((By.name("STATUS"))));

            status.selectByVisibleText("  Further Information Required ");
            WebElement save = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save')]")));
            js.executeScript("arguments[0].click()", save);

            WebElement submit = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
            js.executeScript("arguments[0].click()",submit);

        WebElement customerComplaints = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Customer Complaints']")));
        js.executeScript("arguments[0].click()", customerComplaints);

            WebElement search = wait.
                    until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search']")));
            js.executeScript("arguments[0].click()",search);

            WebElement all = wait.
                    until(ExpectedConditions.visibilityOfElementLocated(By.name("SUBMIT_STATUS")));

            Select allStatus = new Select(all);
            allStatus.selectByVisibleText("All");

            WebElement filter = wait.
                    until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Filter']")));
            js.executeScript("arguments[0].click()",filter);

            WebElement complainNo = wait.
                    until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'"+complaintNo+"')]")));
            //js.executeScript("arguments[0].click()",complainNo);

            Actions actions = new Actions(driver);
            actions.moveToElement(complainNo).doubleClick().build().perform();

            WebElement submit1 = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
            js.executeScript("arguments[0].click()",submit1);

        }

        public void selectProcessStatus() throws InterruptedException {
            selectMarketing();
            selectRefNO();

            Select status = new Select(driver.findElement((By.name("STATUS"))));

            status.selectByVisibleText("  Proceed ");

            WebElement submit = wait.
                    until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
            js.executeScript("arguments[0].click()",submit);


    }



}
