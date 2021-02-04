import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/k0k02a2/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modelbutton = driver.findElement(By.id("modal-button"));
        modelbutton.click();
      //  WebElement closebutton = driver.findElement(By.id("close-button"));

        WebElement okbutton = driver.findElement(By.id("ok-button"));


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",okbutton);

         driver.quit();
    }
}
