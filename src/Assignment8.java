import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8 {
public static void main(String[] args) throws InterruptedException {
 WebDriver driver = new ChromeDriver();

    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    driver.findElement(By.id("autocomplete")).sendKeys("ind");

    Thread.sleep(2000);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

   System.out.println(driver.findElement(By.id("autocomplete")).getDomAttribute("value")); 

}

}