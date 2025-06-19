
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1
		driver1.findElement(By.id("checkBoxOption2")).click();
		//2
		String option = driver1.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(option);
		//3
		WebElement staticd = driver1.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticd);
		dropdown.selectByContainsVisibleText(option);
		//4
		driver1.findElement(By.id("name")).sendKeys(option);
		driver1.findElement(By.id("alertbtn")).click();
		String msg = driver1.switchTo().alert().getText();
		driver1.switchTo().alert().accept();
		//5
		boolean msg2 =msg.contains(option);
		System.out.println(msg2);
	}

}
