package Tests;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Driver.BasePage;
import Driver.ExtentManager;
import Pages.HomePage;
import Pages.ProductPage;

@Listeners(resources.Listeners.class)
public class AllTest extends BasePage{

	public AllTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@BeforeTest
	public void driverFn() throws InterruptedException, IOException {
		driver=getDriver();
	}
		
	
	@Test(priority=1)
	public void addProduct() {
		
		String url="https://teststore.automationtesting.co.uk/index.php";
		driver.get(url);
		HomePage home=new HomePage(driver);
		ExtentManager.log("Starting Homepage newly");
		home.getA().click();
		ExtentManager.pass("Product selected");
		
		
	}

	@Test(priority=2)
    public void addtoCart() {
		
		String url="https://teststore.automationtesting.co.uk/index.php?id_product=1&id_product_attribute=1&rewrite=hummingbird-printed-t-shirt&controller=product#/1-size-s/8-color-white";
		driver.get(url);
		ProductPage product=new ProductPage(driver);
		Select shirtSize=new Select(product.getSize());
		shirtSize.selectByVisibleText("M");
		ExtentManager.pass("size selected");
		product.clickAdd().click();
		ExtentManager.pass("Added to cart");
		
	}

    @AfterTest
   public void closeWindow() {
	driver.close();
	driver.quit();
}

}
