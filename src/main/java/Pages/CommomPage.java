package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommomPage {
	// First Way
//	static WebDriver driver = new ChromeDriver();
//
//	public static void drivers() {
//		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
//		driver.manage().window().maximize();
//		driver.get("http://www.leafground.com/");
//	}

	// second way
	/*
	 * @Test public void drivers() { System.setProperty("webdriver.chrome.driver",
	 * "./chromedriver.exe"); //setup the chromedriver using WebDriverManager
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.get("http://www.leafground.com/"); }
	 */
	// Thirdway

//	@BeforeMethod
//	public void drivers() {
//		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("disable-infobars");
//		WebDriver driver = new ChromeDriver(options);
//		driver.get("http://www.google.com");
//	}
	public static void selectIcon(WebDriver driver, String iconName) {
		WebElement selectIcon = driver.findElement(By.xpath("//h5[text()='" + iconName + "']"));
		selectIcon.click();
	}

//	public static void EditIconTextBox(String label, String Text) {
//		WebElement selectTextBox = driver
//				.findElement(By.xpath("//label[text()='" + label + "']/following-sibling::input"));
//		selectTextBox.sendKeys(Text);
//	}

	public static String getAttribute(WebDriver driver, By by) {
		String text = driver.findElement(by).getAttribute("value");
		return text;

	}

	public static String getText(WebDriver driver, By by) {
		String text = driver.findElement(by).getAttribute("value");
		return text;

	}

	public static void clear(WebDriver driver, String label) {
		driver.findElement(By.xpath("//label[text()='" + label + "']/following-sibling::input")).clear();
	}

//	public static boolean isDisplayed() {
//		boolean displayed = driver.findElement(By.xpath(
//				"//label[text()='Confirm that edit field is disabled']/following-sibling::input[@disabled='true']"))
//				.isDisplayed();
//		return displayed;
//	}


}
