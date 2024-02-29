package OrangeHRM.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;


public class immigration extends login {
	
  @AfterMethod
  
  public void img() {

			
		WebDriver driver = login.driver;
	  
		
		WebElement myinfo =  driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		myinfo.click();
		
		
		WebElement immigration = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
		immigration.click();
		
		WebElement addinfo = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		addinfo.click();
		
		WebElement radio1 = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]"));
		radio1.click();

		
		WebElement passnumber = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		passnumber.click();
		passnumber.sendKeys("S144568");
		System.out.println("Passport Number Entered");
		
//		WebElement issuedate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"));
//		issuedate.click();
//		issuedate.sendKeys("2014-28-02");
//		System.out.println("Issue Date Selected");
//		
//		WebElement expirydate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
//		expirydate.click();
//		expirydate.sendKeys("2026-28-02");
//		System.out.println("Expiry Date Selected");

		WebElement eligiblestatus = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("Elgible");
		System.out.println("Eligible Status Entered");
		
//		WebElement IssuedBy = driver.findElement(By.xpath("//div[contains(@class, 'oxd-select-text--active')]"));
//		IssuedBy.click();
////		Select drpCountry = new Select(driver.findElement(By.xpath("//*[contains(@class, 'oxd-select-text--active')]")));
////		drpCountry.selectByVisibleText("Algeria");
//		System.out.println("Selected From Dropdown");
//		Select select=new Select(driver.findElement(By.xpath(OR.getProperty("India"))));
//		select.selectByValue("India");

	
//		WebElement reviewdate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[3]"));
//		reviewdate.click();
//		reviewdate.sendKeys("2024-21-04");
//		System.out.println("Review Date Selected");
		
		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("All Selected Details are Valid");
		System.out.println("Entered the comments");
		
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		
  }
}
