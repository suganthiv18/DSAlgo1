package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver driver;
	
	public WebDriver initializeDrivers(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			Loggerload.info("Testing on chrome");
			//WebDriverManager.chromedriver().setDriverVersion("116").setup();
			driver = new ChromeDriver();

		}

			// Set Page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		return driver;
	}

	public static WebDriver getdriver() {
		return driver;

	}

	public void closeallDriver() {
		driver.close();
	}

	



}