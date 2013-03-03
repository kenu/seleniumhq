package org.openqa.selenium.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.opera.core.systems.OperaDriver;

public class Selenium2ExampleTest {

	@Test
	public void testFirefox() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		String string = driver.getTitle();
		assertThat(string, is("Google"));
		
	}

	@Test(expected = WebDriverException.class)
	public void testOpera() {
		WebDriver driver = new OperaDriver();
		driver.get("http://www.google.com");

	}

	@Test(expected = WebDriverException.class)
	public void testIE() {
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");

	}

}
