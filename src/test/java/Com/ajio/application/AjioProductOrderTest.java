package Com.ajio.application;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioProductOrderTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.ajio.com/?gclid=CjwKCAjwgr6TBhAGEiwA3aVuIZOiSxiloPvjhNZyxqKFg9fGp7NXhDK1vr5CGHAF4slFDcyL_n2gVhoCngsQAvD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='KIDS']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/s/starting-at-rs-199-4691-77081']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@id='Girls']")).click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//div[.='Colourblock Spread-Collar Shirt']")).click();
		Thread.sleep(3000);
		WebElement buys = driver.findElement(By.xpath("//span[.='3-4Y']"));
		buys.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pdp-addtocart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pdp-addtocart-button']")).click();



	}
}
