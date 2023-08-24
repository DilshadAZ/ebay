package EBay_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class Ebay_Basee {
	
	public static WebDriver driver;
	public static Properties Dpro;
	public Ebay_Basee () {
		try {
			FileInputStream dfile = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\EBay_Config\\EBay_config.Properties");
			Dpro= new Properties();
			Dpro.load(dfile);
		} catch (FileNotFoundException e) {
			System.out.println("Please check the constructor");	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 public void EbayBrowser() {
	 String ebaybrowser = Dpro.getProperty("Browser11");
	 if (ebaybrowser.equalsIgnoreCase("Chrome11") ) {
		 System.setProperty("Webdriver.chrome.driver" , (System.getProperty("user.dir") + "Chrome__Driver/chromedriver.exe"));
		  	ChromeOptions oop = new ChromeOptions();
		  	oop.addArguments("--remote-allow-origin*=");
		  	driver = new ChromeDriver();
		  	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Ebay_Utility.pageLoadTimeout));
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Ebay_Utility.implicitlywait));
		  	driver.manage().window().maximize();
	 
	 }
 
	  else if (ebaybrowser.equalsIgnoreCase("Edge11"))
			 System.setProperty("Webdriver.edge.driver" , (System.getProperty("user.dir") + "Edg_drvr/msedgedriver.exe"));
		  	EdgeOptions oo = new EdgeOptions();
		  	oo.addArguments("--remote-allow-origin*=");
		  	driver = new EdgeDriver();
		  	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Ebay_Utility.pageLoadTimeout));
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Ebay_Utility.implicitlywait));
		  	driver.manage().window().maximize();
 }
      public static void ebaybrowseraunchingURL(String URL) {
	  driver.get(Dpro.getProperty("URLL"));

}

}