package Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BasePage {
	public static WebDriver driver;
//	private String url;
    private Properties prop;
	 
	public BasePage() throws IOException {

		 prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\test\\java\\Driver\\config.properties");
		prop.load(data);

		
	}
	

	public WebDriver getDriver() throws InterruptedException, IOException {
		
		
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\java\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		
		else {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\test\\java\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
		return driver;
		

}
	

/*
 * public String getUrl() throws IOException {
 * 
 * 
 * url=prop.getProperty("url"); 
 * return url;
 * 
 * }
 */

}
