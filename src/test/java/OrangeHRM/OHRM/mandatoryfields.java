package OrangeHRM.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class mandatoryfields extends login {
	@AfterMethod

	public void img() {

		WebDriver driver = login.driver;

		WebElement myinfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		myinfo.click();
		System.out.println("My Info Page");

		WebElement immigration = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
		immigration.click();
		System.out.println("My Immigration Page");


		WebElement addinfo = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		addinfo.click();
		System.out.println("Add Details Page");

		WebElement radio1 = driver.findElement(By
				.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
		radio1.click();
		System.out.println("Selected Visa");
		
		WebElement visanumber = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		visanumber.click();
		visanumber.sendKeys("AS455544568");
		System.out.println("VISA Number Entered");
		
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		System.out.println("Data Saved Successfully;'");
		
		
	}
}
