package com.testcore;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;

	public TestBase() throws IOException {
		FileReader reader = new FileReader(
				"E:\\Workspace\\GmailStation\\src\\main\\java\\com\\configration\\config.properties");
		Properties p = new Properties();
		p.load(reader);
	}

	public static void initilization() {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome update 78\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://mail.google.com/");

	}

}
