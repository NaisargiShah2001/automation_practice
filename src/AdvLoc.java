
		import java.time.Duration;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.Assert;

		public class AdvLoc {

			public static void main(String[] args) throws InterruptedException{
				String name = "Naisargi";
				WebDriver driver1 = new ChromeDriver();
				//String pwd = password(driver1);
				driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver1.get("https://rahulshettyacademy.com/locatorspractice/");
				
				driver1.findElement(By.linkText("Forgot your password?")).click();
				Thread.sleep(1000);
				driver1.findElement(By.xpath("//div/form/input[1]/following-sibling::input[1]")).sendKeys("nnaisargi@deloitte.com");
				Thread.sleep(1000);
				driver1.findElement(By.xpath("//div/form/input[1]/parent::form/input[2]")).sendKeys("nn");
				//driver1.findElement(By.id("inputUsername")).sendKeys(name);
				//driver1.findElement(By.name("inputPassword")).sendKeys(pwd);
				//driver1.findElement(By.className("signInBtn")).click();
				//Thread.sleep(1000);
				//Assert.assertEquals(driver1.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
				//Assert.assertEquals(driver1.findElement(By.tagName("p")).getText(),"successfully logged in.");
				//Assert.assertEquals(driver1.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello "+name+",");
				//driver1.findElement(By.xpath("//button[text()='Log Out']")).click();
				//driver1.close();
				
				
	}
			
		public static String password(WebDriver driver1) throws InterruptedException {
			driver1.get("https://rahulshettyacademy.com/locatorspractice/");
			driver1.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver1.findElement(By.cssSelector(".reset-pwd-btn")).click();
			String pwdSent = driver1.findElement(By.cssSelector("form p")).getText();
			String pwdarray = pwdSent.split("'")[1];
			String finalpwd = pwdarray.split("'")[0];
			return finalpwd;
			
		}

}
