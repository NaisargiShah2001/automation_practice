import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Static
		WebElement staticd = driver1.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticd);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByContainsVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//enabled/disabled
		if(driver1.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			System.out.println("Disabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		//radio
		driver1.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver1.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
			System.out.println("Enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		//Updated
		
		
		driver1.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver1.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
			driver1.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver1.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver1.findElement(By.id("divpaxinfo")).getText());
		
		//Dynamic with index
		
		driver1.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver1.findElement(By.xpath("//a[@value='STV']")).click();
	Thread.sleep(2000);
		//driver1.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		driver1.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		//calender
		driver1.findElement(By.xpath("//td[@class=' ui-datepicker-week-end  ui-datepicker-current-day']")).click();
		
		//Auto Suggestive
		
		driver1.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver1.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India"))
			{		
				option.click();
				break;
			}
		}
		
		//Checkboxes
		System.out.println(driver1.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		Assert.assertFalse(driver1.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		driver1.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		System.out.println(driver1.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		Assert.assertTrue(driver1.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		//number of checkboxes
		////div[@id='discount-checkbox'] //input[@type='checkbox']
		System.out.println(driver1.findElements(By.xpath("//input[@type='checkbox']")).size());
		

	}

}
