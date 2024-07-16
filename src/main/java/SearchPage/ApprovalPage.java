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

public class ApprovalPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public ApprovalPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }

    public void clickOnQAApproval() {
        WebElement qaApproval = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'QA Head Approval')]")));
        js.executeScript("arguments[0].click()",qaApproval);
    }
    public void clickOnPDApproval() {
        WebElement pdApproval = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'PD Head Approval')]")));
        js.executeScript("arguments[0].click()",pdApproval);
    }
       public void clickOnProductionApproval() {
        WebElement productionApproval = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Production Head Approval')]")));
           js.executeScript("arguments[0].click()",productionApproval);
    }
    public void clickOnFactoryApproval() {
        WebElement factoryApproval = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Factory Head Approval')]")));
        js.executeScript("arguments[0].click()",factoryApproval);
    }
       public void clickOnMarketingHead() {
        WebElement marketingHead = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Marketing Head Acknowledgment')]")));
           js.executeScript("arguments[0].click()",marketingHead);
    }

  public void clickOnActionTaken() {
        WebElement actionTaken = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Action Taken Report')]")));
           js.executeScript("arguments[0].click()",actionTaken);
    }

  public void clickOnSalesHead() {
        WebElement salesHead = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sales Head Acknowledgment')]")));
           js.executeScript("arguments[0].click()",salesHead);
    }

  public void clickOnComplaintClose() {
        WebElement complaintClose = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Complaint Close')]")));
           js.executeScript("arguments[0].click()",complaintClose);
    }


    public void selectRefNO() throws InterruptedException {
        WebElement ref = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("COMPLAINT_NO")));

        Select refNo = new Select(ref);
        System.out.println("Complaint Number: "+complaintNo);
        Thread.sleep(2000);
        refNo.selectByValue(complaintNo);


    }
    public void approvalComment() {
        WebElement comment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("COMMENTS")));
        js.executeScript("arguments[0].click()",comment);
        comment.sendKeys("approval comment");
    }

    public void saveAndSubmit()  {

        WebElement save = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save')]")));
        js.executeScript("arguments[0].click()", save);

        WebElement submit = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
        js.executeScript("arguments[0].click()",submit);
    }


    }

