package com.cyient.test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class EtsyScrollOperationTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		//Through BrowserStack
		caps.setCapability("browserstack.user", "sachinpal_aN2rtH");
		caps.setCapability("browserstack.key", "ioY7JubXaspDi6cRsqJ5");
		caps.setCapability("app", "bs://2ef4d66f5c27cd3a91874465c991af10a84bc919");

		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");

		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "Java Android");
		caps.setCapability("name", "first_test");

		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);

		driver.findElementByXPath("//*[@resource-id='com.etsy.android:id/dark_mode_alert_dismiss']").click();

		driver.findElementByXPath("//*[@resource-id='com.etsy.android:id/search_src_text']").sendKeys("watch");
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Search for anything on Etsy']").click();
		driver.findElementByXPath("//*[@resource-id='com.etsy.android:id/search_suggestion_large_header']").click();
		driver.findElementByXPath("//*[@resource-id='com.etsy.android:id/search_suggestion_category_name']").click();

		Thread.sleep(1000);

		String visibleText = "Curtains & Window Treatments";
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))")
				.click();

		driver.findElementByAndroidUIAutomator(
				"UiSelector().resourceId(\"com.etsy.android:id/toggle_3x3_view_button\")").click();

		driver.findElementByAndroidUIAutomator(
				"UiSelector().resourceId(\"com.etsy.android:id/listing_image\").index(0)").click();
		Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator(
				"UiSelector().resourceId(\"com.etsy.android:id/favorite_confetti\").index(4)").click();
		driver.quit();

	}

}
