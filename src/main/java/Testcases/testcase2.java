package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.CommomPage;

public class testcase2 extends CommomPage {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void drivers(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		} else {
			System.setProperty("webdriver.ie.driver", "./IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void testcase2() {
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/");

		CommomPage.selectIcon(driver, "Droppable");

		Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Play with Droppable')]")).getText(),
				"Play with Droppable");
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions act = new Actions(driver);

		act.dragAndDrop(from, to).build().perform();

	}

	@AfterMethod
	public void aftersuite() {
		driver.close();
	}
}
