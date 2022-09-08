package appiumtests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NotesApps {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		
		try {
			openNotes();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	public static void openNotes() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "OPPO A95");
		cap.setCapability("udid", "1a6c3667");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		
		cap.setCapability("appPackage", "com.google.android.keep");
		cap.setCapability("appActivity", "com.google.android.keep.ui.activities.BrowseActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application Started..");
		}

}
