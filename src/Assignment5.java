
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://the-internet.herokuapp.com/nested_frames");
		driver1.switchTo().frame(driver1.findElement(By.xpath("//frame[@name='frame-top']")));
		driver1.switchTo().frame(driver1.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver1.findElement(By.id("content")).getText());

	}

}
