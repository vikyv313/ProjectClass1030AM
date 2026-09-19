package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void insertText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void buttonClick(WebElement element) {
		element.click();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void swipeRight() {
		System.out.println("Swipe Right");

	}

	public void horizontalSwipe() {
		System.out.println("HOR");

	}

	public void veriticalSwipe() {
		System.out.println("VERT");

	}

}
