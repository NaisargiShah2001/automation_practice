import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Assignment {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver1.findElement(By.id("checkBoxOption1")).click();
		//System.out.println(driver1.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		//driver1.findElement(By.id("checkBoxOption1")).click();
		//System.out.println(driver1.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());

		System.out.println(driver1.findElements(By.xpath("//input[@type='checkbox']")).size());
	}
	
	

}
