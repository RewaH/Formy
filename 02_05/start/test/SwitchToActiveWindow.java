import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/k0k02a2/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newtabbutton = driver.findElement(By.id("new-tab-button"));
         newtabbutton.click();

         String originalHandle = driver.getWindowHandle();

         for(String handle1: driver.getWindowHandles()) {
             driver.switchTo().window(handle1);
         }
         driver.switchTo().window(originalHandle);


        driver.quit();
    }
}
