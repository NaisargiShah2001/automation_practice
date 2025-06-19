import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.NoSuchElementException;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://the-internet.herokuapp.com/windows");
		driver1.manage().window().maximize();
		driver1.findElement(By.linkText("Click Here")).click();
		Set<String> win = driver1.getWindowHandles();
		Iterator<String> i = win.iterator();
		String parentId = i.next();
		String childId = i.next();
		driver1.switchTo().window(childId);
		System.out.println(driver1.findElement(By.tagName("h3")).getText());
		driver1.switchTo().window(parentId);
		System.out.println(driver1.findElement(By.tagName("h3")).getText());

	}

}
