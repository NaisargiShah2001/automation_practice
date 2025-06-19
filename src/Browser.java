import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("www.google.com");
		driver1.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver1.navigate().back();
		driver1.navigate().forward();
		
		
	}

}
