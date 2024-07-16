package SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CustomerComplaintsPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    public static String complaintNo = "";
    public CustomerComplaintsPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor)driver;
    }

    public void clickOnComplaintManagement() {

        WebElement complaintMange = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Complaint Management']")));
        //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", complaintMange);
    }

    public void selectCustomerComplaints() {
        WebElement customerComplaints = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Customer Complaints']")));
        js.executeScript("arguments[0].click()", customerComplaints);

    }
    public void fillTheRequireField() {

        Select natureOfComplaint = new Select(driver.findElement(By.name("NATURE_OF_COMPLAINT")));
        natureOfComplaint.selectByVisibleText("Artwork Error");

        Select product = new Select(driver.findElement(By.name("PRODUCT_CODE")));
        product.selectByVisibleText("AC0103 -- Radhuni Turmeric Powder");

        Select manufactureSite = new Select(driver.findElement(By.name("MANUFACTURING_SITE")));
        manufactureSite.selectByVisibleText("SFBL Head Office");

        WebElement complaintsBy = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.id("COMPLAINT_RAISE_BY")));
        js.executeScript("arguments[0].click()", complaintsBy);
        complaintsBy.sendKeys("Rafi");

        WebElement address = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.id("COMPLAINT_RAISE_BY_ADDRESS")));
        js.executeScript("arguments[0].click()", address);
        address.sendKeys("Dhaka");

    }
    public void saveInformation() throws InterruptedException {
        WebElement save = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save')]")));
        js.executeScript("arguments[0].click()", save);

        WebElement getComplaintsNo = wait.
                until(ExpectedConditions.presenceOfElementLocated(By.id("COMPLAINT_NO")));
        Thread.sleep(2000);
        complaintNo = getComplaintsNo.getAttribute("value");
        //System.out.println(complaintNo);

    }
    public void submitInformation(){
        WebElement submit = wait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Submit')]")));
        js.executeScript("arguments[0].click()",submit);
    }
}
