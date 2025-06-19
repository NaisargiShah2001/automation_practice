import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://rahulshettyacademy.com/angularpractice/");
		driver1.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("abc");
		driver1.findElement(By.xpath("//div[@class='form-group']/input[@name='email']")).sendKeys("abc@xyz.com");
		driver1.findElement(By.id("exampleInputPassword1")).sendKeys("pwd");
		driver1.findElement(By.id("exampleCheck1")).click();
		WebElement staticd = driver1.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticd);
		dropdown.selectByIndex(1);
		
		driver1.findElement(By.id("inlineRadio1")).click();
		driver1.findElement(By.xpath("//div[@class='form-group']/input[@name='bday']")).sendKeys("02/06/2021");
		driver1.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		Thread.sleep(3000);
		System.out.println(driver1.findElement(By.cssSelector("div.alert")).getText());
		
	}

}
