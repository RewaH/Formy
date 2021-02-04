import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/k0k02a2/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownbutton=driver.findElement(By.id("dropdownMenuButton"));
        dropdownbutton.click();

       // WebElement dropdown=driver.findElement(By.xpath("/html/body/div/div/div/a[6]"));
        //dropdown.click();

        WebElement model=driver.findElement(By.xpath("/html/body/div/div/div/a[11]"));
        model.click();


      //  driver.quit();
    }
}
