package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By a=By.linkText("Hummingbird Printed T-Shirt");
	
	public WebElement getA() {
		return driver.findElement(a);
		
	}

}
