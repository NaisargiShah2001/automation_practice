import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class oneone {

	public static void main(String[] args) {
		
		//Chrome
		//System.setProperty("webdriver.chrome.driver", "path")
		//WebDriver driver1 = new ChromeDriver();
		
		//Firefox
		//System.setProperty("webdriver.gecko.driver", "path")
		//WebDriver driver2 = new FirefoxDriver();
		
		//Edge
		//System.setProperty("webdriver.edge.driver", "path")
		WebDriver driver = new EdgeDriver();
		
		//Webdriver methods
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.getPageSource();
		driver.close();
	}

}
