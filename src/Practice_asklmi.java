import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_asklmi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://test-lmi.hcdev.deloitte.com/");
		Thread.sleep(40000);
		driver1.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver1.findElement(By.xpath("//span[@class='pointer-cursor']")).click();
		driver1.findElement(By.xpath("(//span[@class='card-title'])[1]")).click();
		driver1.findElement(By.cssSelector("#mat-select-value-1")).click();
		WebElement listbox = driver1.findElement(By.cssSelector("div[role='listbox']"));
		scrollToBottom(driver1,listbox);
		List<WebElement> values = driver1.findElements(By.cssSelector(".mdc-list-item__primary-text"));
		System.out.println(values.size());
		
		
	}



public static void scrollToBottom(WebDriver driver, WebElement listbox) throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    long lastHeight = (long) js.executeScript(
        "return arguments[0].scrollHeight;", listbox);

    while (true) {
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", listbox);
        Thread.sleep(1000); // Wait for new data to load

        long newHeight = (long) js.executeScript(
            "return arguments[0].scrollHeight;", listbox);

        if (newHeight == lastHeight) {
            break; // No more new data loaded
        }
        lastHeight = newHeight;
    }
}
}