import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver", "/Users/fitri.manurung/Workspace/Tools/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("fitriKimmy");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
