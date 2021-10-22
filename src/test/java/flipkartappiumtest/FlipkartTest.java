package flipkartappiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class FlipkartTest {
	
	public static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			calculator();
			flipkart();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			e.getMessage();
			e.printStackTrace();
		}

	}
	
	@BeforeTest
	public static void flipkart() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO F1s");
		cap.setCapability("udid", "EQGQSSCAM7JRF6DQ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1");
		cap.setCapability("appPackage", "com.flipkart.android");
		cap.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, cap);
		Thread.sleep(10000);
		
		// Scroll down and choose English language
		String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"English\").instance(0))";
		driver.findElementByAndroidUIAutomator(scrollElement).click();
		
		//Continue button
		driver.findElement(By.id("com.flipkart.android:id/select_btn")).click();
		Thread.sleep(5000);
		
		//Filling Phone number field 9090275237
		driver.pressKeyCode(16);
		driver.pressKeyCode(7);
		driver.pressKeyCode(16);
		driver.pressKeyCode(7);
		driver.pressKeyCode(9);
		driver.pressKeyCode(14);
		driver.pressKeyCode(12);
		driver.pressKeyCode(9);
		driver.pressKeyCode(10);
		driver.pressKeyCode(14);
			
		//continue
		driver.findElement(By.id("com.flipkart.android:id/button")).click();
		Thread.sleep(10000);
		//All categories button
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.id("com.flipkart.android:id/flyout_parent_title[3]")).click();

		
	}
	
	@Test(description = "Language")
	public void beginningPageTest() {
		
	}
	
//	public static void calculator() throws Exception {
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("deviceName", "OPPO F1s");
//		cap.setCapability("udid", "EQGQSSCAM7JRF6DQ");
//		cap.setCapability("platformName", "Android");
//		cap.setCapability("platformVersion", "5.1");
//		cap.setCapability("appPackage", "com.android.calculator2");
//		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
//		
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		driver = new AppiumDriver<MobileElement>(url,cap);
//	}

	
}
