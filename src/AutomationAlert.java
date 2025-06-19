import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutomationAlert {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver1.findElement(By.id("name")).sendKeys("ABC");
		driver1.findElement(By.id("alertbtn")).click();
		driver1.switchTo().alert().getText();
		driver1.switchTo().alert().accept();
		driver1.findElement(By.id("confirmbtn")).click();
		driver1.switchTo().alert().getText();
		driver1.switchTo().alert().dismiss();
		
		
	}

}
