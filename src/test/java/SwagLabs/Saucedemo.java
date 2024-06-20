package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Saucedemo {
WebDriver driver;
@Test(priority=1)
void OpenBrowser()
{
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	}
@Test(priority=2)
void Launchapp()
{
	driver.get("https://www.saucedemo.com/");
}
@Test(priority=3)
void UserLogin() {
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	   driver.findElement(By.name("password")).sendKeys("secret_sauce");
	   driver.findElement(By.name("login-button")).click();
	}
@Test(priority=4)
public void AddCart() {
	driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
	
}
@Test(priority=5)
void ViewCart() {
	driver.findElement(By.id("shopping_cart_container")).click();
}
@Test(priority=6)
void CheckOut() {
	driver.findElement(By.id("checkout")).click();
}
@Test(priority=7)
void CheckOutYourInformation() {
	driver.findElement(By.id("first-name")).sendKeys("Sriram");
   driver.findElement(By.id("last-name")).sendKeys("Garikipati");
   driver.findElement(By.id("postal-code")).sendKeys("521001");
}
@Test(priority=8)
void Continue() {
	driver.findElement(By.id("continue")).click();
}
@Test(priority=8)
void Finish() {
	driver.findElement(By.id("finish")).click();
}
@Test(priority=9)
void BackHome() {
	 driver.findElement(By.id("back-to-products")).click();
}
@Test(priority=10)
 void Logout() {
   driver.findElement(By.id("react-burger-menu-btn")).click();
   driver.findElement(By.id("logout_sidebar_link")).click();
}
@Test(priority=11)
 void CloseBrowser() {
	   driver.close();
	}


}

	

