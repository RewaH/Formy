import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/k0k02a2/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);
        waitForTheFieldAppear(driver);


        assertEquals ("The form was successfully submitted!", confirmationText(driver));


        driver.quit();
    }
         public static void submitForm (WebDriver driver)
    {
        driver.findElement(By.id("first-name")).sendKeys("Rewaa");

        driver.findElement(By.id("last-name")).sendKeys("Hamed");

        driver.findElement(By.id("job-title")).sendKeys("Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.id("select-menu")).click();

        driver.findElement(By.cssSelector("option[value='3']")).click();

        WebElement datepicker=driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("2/6/1992");
        datepicker.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        // WebElement submit =driver.findElement(By.cssSelector("btn.btn-lg.btn-primary"));
        //ubmit.click();
    }
    public static void waitForTheFieldAppear (WebDriver driver)
    {
        WebDriverWait wait=new WebDriverWait (driver,10);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.className("alert")));
    }

    public static String confirmationText (WebDriver driver)
    {
        return driver.findElement(By.className("alert")).getText();

    }
}
