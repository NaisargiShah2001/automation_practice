import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Scope_Optimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
				System.out.println(driver1.findElements(By.tagName("a")).size());
				WebElement footer = driver1.findElement(By.id("gf-BIG"));//scope
				System.out.println(footer.findElements(By.tagName("a")).size());
				WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));//scope
				int m = column.findElements(By.tagName("a")).size();
				System.out.println(m);
				//optimize- to click on all links in the column
				for(int i=1;i<m;i++) {
					String enter = Keys.chord(Keys.CONTROL,Keys.ENTER);
					column.findElements(By.tagName("a")).get(i).sendKeys(enter);
				}
				Set<String> title = driver1.getWindowHandles();
				Iterator<String> it = title.iterator();
				while(it.hasNext()) {
					
					driver1.switchTo().window(it.next());
					System.out.println(driver1.getTitle());
					
				}
	}

}
