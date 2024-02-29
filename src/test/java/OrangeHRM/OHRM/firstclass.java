package OrangeHRM.OHRM;

import java.util.concurrent.TimeUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class firstclass {

	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException{

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	

				WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		
	
				Actions builder = new Actions(driver);

				org.openqa.selenium.interactions.Action seriesofact = builder.moveToElement(username).click().keyDown(username,Keys.INSERT).sendKeys(username, "admin").build();
				seriesofact.perform();
			
	
				
				WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
				
		
				org.openqa.selenium.interactions.Action seriesofact1 = builder.moveToElement(password).click().keyDown(password, Keys.INSERT).sendKeys(password, "admin123").build();
				seriesofact1.perform();
				
			
			
				WebElement loginbutton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
				loginbutton.click();
				
				
				
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
				
				WebElement issuedate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]"));
				issuedate.click();
				issuedate.sendKeys("2014-28-02");
				System.out.println("Issue Date Selected");
				
				WebElement expirydate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
				expirydate.click();
				expirydate.sendKeys("2026-28-02");
				System.out.println("Expiry Date Selected");

				WebElement eligiblestatus = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));
				eligiblestatus.click();
				eligiblestatus.sendKeys("Elgible");
				System.out.println("Eligible Status Entered");
				
//				WebElement IssuedBy = driver.findElement(By.xpath("//div[contains(@class, 'oxd-select-text--active')]"));
//				IssuedBy.click();
////				Select drpCountry = new Select(driver.findElement(By.xpath("//*[contains(@class, 'oxd-select-text--active')]")));
////				drpCountry.selectByVisibleText("Algeria");
//				System.out.println("Selected From Dropdown");
//				Select select=new Select(driver.findElement(By.xpath(OR.getProperty("India"))));
//				select.selectByValue("India");

			
				WebElement reviewdate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[3]"));
				reviewdate.click();
				reviewdate.sendKeys("2024-21-04");
				System.out.println("Review Date Selected");
				
				WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
				comments.click();
				comments.sendKeys("All Selected Details are Valid");
				System.out.println("Entered the comments");
				
				WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
				save.click();
				
	
			}

}
