import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver1, Duration.ofSeconds(10));
		driver1.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		//login
		String username= driver1.findElement(By.xpath("//p[@class='text-center text-white']/b/i")).getText();
		String password = driver1.findElement(By.xpath("(//p[@class='text-center text-white']/b/i)[2]")).getText();
		driver1.findElement(By.id("username")).sendKeys(username);
		driver1.findElement(By.id("password")).sendKeys(password);
		driver1.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='okayBtn']")));
		driver1.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement staticd = driver1.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(staticd);
		dropdown.selectByContainsVisibleText("Consultant");
		driver1.findElement(By.id("terms")).click();
		driver1.findElement(By.id("signInBtn")).click();
		//addtocart
		List<WebElement> Items = driver1.findElements(By.xpath("//button[@class='btn btn-info']"));
		int num = Items.size();
		for(int i=0;i<num;i++) {
			Items.get(i).click();
		}
		//checkout
		driver1.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
		driver1.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
	}

}
