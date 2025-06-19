import java.time.Duration;
import java.util.Arrays;
import java.util.List;
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
public class Waits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		//driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Explicit wait
		WebDriverWait w = new WebDriverWait(driver1, Duration.ofSeconds(5));
		//FluentWait
		Wait<WebDriver> w1 = new FluentWait<WebDriver>(driver1).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);;

		String[] veggies= {"Cucumber","Carrot","Pears","Cashews"};
		addItems(driver1,veggies);
		driver1.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver1.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		driver1.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		

		driver1.findElement(By.cssSelector("button.promoBtn")).click();
		//Fluent wait
		
		WebElement wait = w1.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver1) {
				if(driver1.findElement(By.cssSelector("span.promoInfo")).isDisplayed()) {
					return driver1.findElement(By.cssSelector("span.promoInfo"));
				}
				else {
					return null;
				}
			}
		});
		System.out.println(driver1.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
	public static void addItems(WebDriver driver1,String[] veggies) {
		int j=0;
		List<WebElement> allVeggies = driver1.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<allVeggies.size();i++) {
			String name = allVeggies.get(i).getText();
			String[] spl = name.split("-");
			String correctName = spl[0].trim();
			List itemsNeededList = Arrays.asList(veggies);
			if(itemsNeededList.contains(correctName)) {
				j++;
				driver1.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==veggies.length) {
					break;
				}
			}
		}
		
	}

}
