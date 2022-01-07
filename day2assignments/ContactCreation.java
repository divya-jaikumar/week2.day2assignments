package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactCreation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		WebElement firstname=driver.findElement(By.id("firstNameField"));
				firstname.sendKeys("Divya");
		driver.findElement(By.id("lastNameField")).sendKeys("V");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Divya");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Venkat");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("In a automation testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("amdivya.v@gmail.com");
		WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateprovince=new Select(state);
		stateprovince.selectByVisibleText("Alaska");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		
		WebElement fstName=driver.findElement(By.id("updateContactForm_firstName"));
		fstName.clear();
		fstName.sendKeys("divi",Keys.TAB);
		
		WebElement desc=driver.findElement(By.id("updateContactForm_description"));
		desc.clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("changes made");
		driver.findElement(By.xpath("//input[@class='smallSubmit'and @value='Update']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		//subMenuButton
		//driver.close();
		
		
		
		


	}

}
