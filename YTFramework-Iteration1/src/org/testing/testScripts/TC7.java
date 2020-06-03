package org.testing.testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7
{
	ChromeDriver driver;

	@BeforeMethod
	public void browserOpen()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void commentPost() throws InterruptedException
	{
		driver.findElement(By.xpath("//paper-button[@aria-label='Sign in']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("panwarp727@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pradygoogle");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElements(By.id("video-title")).get(9).click();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@id='img'and @alt='Pradeep Panwar']")).click();
		ac.sendKeys(Keys.TAB).perform();
		Thread.sleep(5000);
		ac.sendKeys("Very Nice Video").perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Comment']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@id='img'and @alt='Avatar image']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
		Thread.sleep(5000);
		
			}
	@AfterMethod
	public void browserClose()
	{
		driver.close();
    }

}
