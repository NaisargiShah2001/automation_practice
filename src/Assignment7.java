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
public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> columns = driver1.findElements(By.xpath("//table[@name='courses']//th"));
		List<WebElement> rows = driver1.findElements(By.xpath("//table[@name='courses']//td[3]"));
		System.out.println(columns.size());
		System.out.println(rows.size());
		String latest = new String();
		for(int i=0;i<columns.size();i++) {
			String loop = driver1.findElements(By.xpath("//table[@name='courses']//tr[3]/td")).get(i).getText();
			 latest = (latest + " |" +  loop);
		}
		System.out.println(latest);

	}

}
