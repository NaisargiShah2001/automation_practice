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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.NoSuchElementException;

public class FramesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://jqueryui.com/droppable/");
		driver1.switchTo().frame(driver1.findElement(By.cssSelector("iframe.demo-frame")));
		Actions a = new Actions(driver1);
		WebElement source = driver1.findElement(By.id("draggable"));
		WebElement target = driver1.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
	}

}
