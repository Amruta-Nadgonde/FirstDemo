package firstdemo.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstTest {
	WebDriver driver;
  @Test
  public void googleSearch() throws InterruptedException {
	  driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
	  driver.findElement(By.name("btnG")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.partialLinkText("Selenium")).click();
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	 
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
