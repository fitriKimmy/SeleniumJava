import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver", "/Users/fitri.manurung/Workspace/Tools/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement cb1 = driver.findElement(By.cssSelector("#checkbox-1"));
        cb1.click();

        WebElement cb2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        cb2.click();

        WebElement cb3 = driver.findElement(By.id("checkbox-3"));
        cb3.click();

        driver.quit();
    }
}
