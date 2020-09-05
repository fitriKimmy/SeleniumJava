import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static junit.framework.TestCase.assertEquals;

public class Form {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver", "/Users/fitri.manurung/Workspace/Tools/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

       driver.findElement(By.id("first-name")).sendKeys("Alex");
       driver.findElement(By.id("last-name")).sendKeys("Sandra");
       driver.findElement(By.id("job-title")).sendKeys("Test Engineer");
       driver.findElement(By.id("radio-button-2")).click();
       driver.findElement(By.id("checkbox-2")).click();
       driver.findElement(By.cssSelector("option[value='1']")).click();
       driver.findElement(By.id("datepicker")).sendKeys("10/10/2022");
       driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);;
       driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

       WebDriverWait wait = new WebDriverWait(driver, 10);
       WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

       String alertText = alert.getText();
       assertEquals("The form was successfully submitted!", alertText);

       driver.quit();
    }
}
