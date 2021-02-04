import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SauceLabsExample {


        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/k0k02a2/Downloads/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.get("https://formy-project.herokuapp.com/keypress");
            WebElement name = driver.findElement(By.id("name"));
            name.click();
             name.sendKeys("Rewaa");
             WebElement button = driver.findElement(By.id ("button"));
            button.click();
           // driver.quit();
        }
    }
