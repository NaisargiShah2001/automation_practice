import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] companies = {"AB","XyZ"};
		WebDriver driver = new ChromeDriver();
		driver.get("https://test-lmi.hcdev.deloitte.com/");
		JavascriptExecutor exec = (JavascriptExecutor)driver;
		Thread.sleep(100000);
		driver.findElement(By.cssSelector("span.pointer-cursor:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector(".card-info")).click();
		driver.findElement(By.cssSelector("div#mat-select-value-1")).click();
		exec.executeScript("document.querySelector('#mat-select-0-panel').scrollTop=5000");
	}

}
