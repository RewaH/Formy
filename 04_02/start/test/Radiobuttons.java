import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/k0k02a2/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement ckeckbox1 = driver.findElement(By.id("checkbox-1"));
        ckeckbox1.click();

        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        checkbox2.click();

        WebElement radiobutton3 =  driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        radiobutton3.click();

        //driver.quit();
    }
}
