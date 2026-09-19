package com.cts;

import org.jspecify.annotations.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		boolean b = title.contains("OMR");
		Assert.assertTrue("Verify Title", b);
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens@gmail.com");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("greens@123");
		String actual = txtPass.getAttribute("value");
		Assert.assertEquals("Verify Password", "Greens@12", actual);
		WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Login']"));
		btnLogin.click();
	}
	
}
