package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static SearchPage.CustomerComplaintsPage.complaintNo;

public class HeadOfQAPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public HeadOfQAPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;

    }
    public void clickOnHeadOfQA()  {


        WebElement headOfQA = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Head of QA')]")));
        js.executeScript("arguments[0].click()", headOfQA);
    }
    public void selectRefNo() throws InterruptedException {
        WebElement ref = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.id("COMPLAINT_NO")));

        Select refNo = new Select(ref);
        System.out.println("Complaint Number: "+complaintNo);
        Thread.sleep(2000);
        refNo.selectByValue(complaintNo);


    }

    public void selectFurtherStatus()  {

        Select status = new Select(driver.findElement((By.name("STATUS"))));
        status.selectByVisibleText("Further Information Required");

        WebElement labRefNo = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.id("LAB_REF_NO")));
        labRefNo.sendKeys("labRefNo");

        WebElement finding = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.id("COMMENTS")));
        finding.sendKeys("finding comment");

        Select qaDepartment = new Select(driver.findElement(By.name("QA_DEPARTMENT")));
        qaDepartment.selectByVisibleText("Naim");

        Select pdDepartment = new Select(driver.findElement(By.name("PD_DEPARTMENT")));
        pdDepartment.selectByVisibleText("Shuvo");

        Select productionDepartment = new Select(driver.findElement(By.name("PRODUCTION_DEPARTMENT")));
        productionDepartment.selectByVisibleText("riz");

        Select engineeringDepartment = new Select(driver.findElement(By.name("ENGINEERING_DEPARTMENT")));
        engineeringDepartment.selectByVisibleText("Anik");

        WebElement save = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save')]")));
        js.executeScript("arguments[0].click()", save);

        WebElement submit = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
        js.executeScript("arguments[0].click()",submit);


        WebElement factoryHead = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Factory Head']")));
        js.executeScript("arguments[0].click()", factoryHead);

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

        clickOnHeadOfQA();
        selectRefNo();

        Select status = new Select(driver.findElement((By.name("STATUS"))));

        status.selectByVisibleText("Proceed");

        WebElement submit = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
        js.executeScript("arguments[0].click()",submit);
    }

}
