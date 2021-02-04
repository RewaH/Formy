import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/k0k02a2/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

       // WebElement datefield=driver.findElement(By.id("datepicker"));
        WebElement datefield = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        datefield.sendKeys("28/1/2021");
        datefield.sendKeys(Keys.RETURN);

       datefield.sendKeys(Keys.ENTER);
        driver.quit();
    }
}