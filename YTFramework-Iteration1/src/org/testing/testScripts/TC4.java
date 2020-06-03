package org.testing.testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4
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
	public void history() throws InterruptedException
	{
		driver.findElement(By.xpath("//paper-button[@aria-label='Sign in']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("panwarp727@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pradygoogle");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//yt-formatted-string[text()='History']")).click();
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