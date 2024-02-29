package OrangeHRM.OHRM;

import org.testng.annotations.AfterMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class editrecords extends login {
  @AfterMethod
  
  	public void Deletefile() {
	  
  		WebDriver driver = login.driver;
  		
  		WebElement username = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
  		username.click();
  		System.out.println("My Info Page");
  		
  		WebElement imm=driver.findElement(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[5]"));
  		imm.click();
  		System.out.println("My Immigration");
  		
  		WebElement maincheck=driver.findElement(By.xpath("(//span[@class=\"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"])[1]"));
  		maincheck.click();
  		System.out.println("Selected Checkbox");
  		
  		WebElement delete=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin\"]"));
  		delete.click();
  		System.out.println("Delete Message highlight by using chechkbox ");
  		
  		WebElement alertdel=driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]"));
  		
  		alertdel.click();
  		System.out.println("deleted by using icon");
  		
  }
  }
