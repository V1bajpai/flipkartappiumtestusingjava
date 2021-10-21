package flipkartappiumtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FlipkartTest {
	
	public static AppiumDriver<MobileElement> driver;
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
	
	public static void flipkart() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO F1s");
		cap.setCapability("udid", "EQGQSSCAM7JRF6DQ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1");
		cap.setCapability("appPackage", "com.flipkart.android");
		cap.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
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
