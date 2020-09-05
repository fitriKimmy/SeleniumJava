import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static junit.framework.TestCase.assertEquals;

public class Form {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver", "/Users/fitri.manurung/Workspace/Tools/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!", confirmationPage.getBannerText(driver));

        driver.quit();
    }
}
