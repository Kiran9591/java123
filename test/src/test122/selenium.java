package test122;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.tools.javac.util.List;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/kiranmanandhar/Downloads/chromedriver");
//
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--disable-notifications");
//	WebDriver d = new ChromeDriver(options);
//	
//	driver.findElement(By.id("email")).sendKeys("anticbaby@gmail.com");
//	driver.findElement(By.id("pass")).sendKeys("qaclass123");
//	
//	driver.findElement(By.name("login")).click();
//	
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	//driver.findElement(by.xpath(
	
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
WebDriver facebook = new ChromeDriver(options);

//sent Today at 4:59 PM
//ChromeOptions options = new ChromeOptions();
//options.addArguments("--disable-notifications");
//WebDriver facebook = new ChromeDriver(options);

facebook.get("https://www.facebook.com");

facebook.findElement(By.id("email")).sendKeys("anticbaby@gmail.com");
facebook.findElement(By.id("pass")).sendKeys("qaclass123");
facebook.findElement(By.name("login")).click();

facebook.manage().window().maximize();
facebook.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
facebook.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/a/div[1]/div")).click();
facebook.findElement(By.xpath("//a[text(🙁 'Friends']")).click();
facebook.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/a[1]/div")).click();

//facebook.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait wait = new WebDriverWait (facebook, 15);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='buofh1pr hv4rvrfc']/div/a")));
//List<WebElement> friends = facebook.findElements(By.xpath("//div[@class='buofh1pr hv4rvrfc']/div/a"));

//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//List<WebElement> Allfriends = facebook.findElements(By.xpath("//div[@class='buofh1pr hv4rvrfc']/div/a"));

////System.out.println(Allfriends.size());
//for (int i = 0; i < Allfriends.size(); i++) {
//	System.out.println(Allfriends.get(i).getText());
//}
facebook.close();
	//namastey
	
	
	
		
		
		
		
	}

}
