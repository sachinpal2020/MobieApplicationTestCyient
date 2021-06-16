package com.cyient.test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class EtsyRegistrationTest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
	      
		caps.setCapability("browserstack.user", "sachinpal_aN2rtH");
	      caps.setCapability("browserstack.key", "ioY7JubXaspDi6cRsqJ5");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://2ef4d66f5c27cd3a91874465c991af10a84bc919");
	      
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "First Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");

	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	        new URL("http://hub.browserstack.com/wd/hub"), caps);
	        
	        /* Write your Custom code here */
	      
	     driver.findElementByXPath("//*[@resource-id='com.etsy.android:id/dark_mode_alert_dismiss']").click();	
	   
	     driver.findElementByAndroidUIAutomator("UiSelector().text(\"Get started\")").click();  
	   
	     driver.findElementByXPath("//*[@resource-id='com.etsy.android:id/switch_to_register']").click();
	     driver.findElementByAndroidUIAutomator("UiSelector().text(\"First Name\")").sendKeys("Sachin");
	     driver.findElementByAndroidUIAutomator("UiSelector().text(\"Your Email\")").sendKeys("ed360k@gmail.com");
	     driver.findElementByAndroidUIAutomator("UiSelector().text(\"Password\")").sendKeys("Abc@123456765");
	     driver.findElementByAndroidUIAutomator("UiSelector().text(\"Register\")").click();
	     driver.findElementByXPath("//*[@resource-id='com.etsy.android:id/button_register']").click();
	   
	     
	     driver.quit();
	}

}
