import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.get("https://rahulshettyacademy.com/locatorspractice/");
		driver1.findElement(By.id("inputUsername")).sendKeys("Naisargi");
		driver1.findElement(By.name("inputPassword")).sendKeys("abc");
		driver1.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver1.findElement(By.cssSelector("p.error")).getText());

		driver1.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Naisargi");
		driver1.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nnaisargi@deloitte.co");
		driver1.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver1.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("nnaisargi@deloitte.com");
		driver1.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
		driver1.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver1.findElement(By.cssSelector("form p")).getText();
		
		driver1.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(1000);
		driver1.findElement(By.cssSelector("#inputUsername")).sendKeys("Naisargi");
		driver1.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver1.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver1.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
