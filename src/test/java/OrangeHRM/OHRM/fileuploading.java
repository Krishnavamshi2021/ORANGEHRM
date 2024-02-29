package OrangeHRM.OHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;


public class fileuploading extends login{
	
	public static WebDriver driver;
  
	@AfterMethod
  
  public void file() {

		WebDriver driver = login.driver;
		
	  		WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
	  		myInfo.click();
	  		System.out.println("Clicked on myinfo");
	  		
	  		WebElement imme = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
	  		imme.click();
	  		System.out.println("Clicked on Immegration");
	  		
	  		WebElement addbutton = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Add'])[2]"));
	  		addbutton.click();
	  		
	  		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));

	  		upload.sendKeys("C:\\Users\\yuvia\\Downloads\\signvamshi.jpeg");
	  		
	  		
	  		WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
	  		comments.click();
	  		comments.sendKeys("Comments");
	  		
	  		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
	  		save.click();
	  		
	  		
	  }
  }

