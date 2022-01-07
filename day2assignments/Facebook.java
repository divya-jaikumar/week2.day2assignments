package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Divya");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jai");
        driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("amdivya.v@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("amdivya.v@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("venkatesan30");
        
        WebElement day=driver.findElement(By.id("day"));
        Select date= new Select(day);
        date.selectByIndex(4);
        
        WebElement month=driver.findElement(By.id("month"));
        Select mon=new Select(month);
        mon.selectByVisibleText("Jun");
        
        WebElement year=driver.findElement(By.id("year"));
        Select yy=new Select(year);
        yy.selectByValue("1995");
		//driver.findElement(By.linkText("Female")).click();

        
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.close();
        


	}

}
