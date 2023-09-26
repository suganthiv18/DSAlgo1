package Hooks;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import Utilities.ConfigReader;
import Utilities.Loggerload;
import Utilities.DriverFactory;

public class Hooks {
	private static WebDriver driver;
	private static DriverFactory driverfactory;
	
	@BeforeAll
	public static void before() throws Throwable {
		//Get browser Type from config file
		Loggerload.info("Loading Config file");
		ConfigReader.readConfig();
		String browser = ConfigReader.getBrowserType();
		
		//Initialize driver from driver factory
		driverfactory = new DriverFactory();
		driver = driverfactory.initializeDrivers(browser);
		Loggerload.info("Initializing driver for : "+browser);
		driver.get(ConfigReader.getUrl());
	}
	
	@AfterAll
	public static void after() {
		Loggerload.info("Closing Driver");
		driverfactory.closeallDriver();
	}
}
