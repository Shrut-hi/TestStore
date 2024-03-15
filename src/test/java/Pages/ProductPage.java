package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	public WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}
	By size=By.xpath("//select[@id='group_1']");
	By addBtn=By.xpath("/html/body/main/section/div/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button");
	public WebElement getSize() {
		return driver.findElement(size);
		
	}
	
	public WebElement clickAdd() {
		return driver.findElement(addBtn);
		
	}

}
