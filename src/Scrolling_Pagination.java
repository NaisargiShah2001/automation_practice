import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Scrolling_Pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		JavascriptExecutor exec = (JavascriptExecutor)driver1;
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver1.manage().window().maximize();
		exec.executeScript("window.scrollBy(0,600)"); //main scroll
		Thread.sleep(3000);
		exec.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");//scroll inside the table until the scroll is at the bottom
		List<WebElement> values = driver1.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int sum = 0;
		int size= values.size();
		for(int i=0;i<size;i++) {
			int value =Integer.parseInt(values.get(i).getText());
			sum = sum+value;
		}
		System.out.println(sum);
		int web = Integer.parseInt(driver1.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(web,sum);

	}

}
