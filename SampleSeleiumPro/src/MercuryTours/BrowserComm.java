package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumJarfiles\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

String url="https://www.amazon.co.uk/";
driver.get(url);
driver.manage().window().maximize();

driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]")).click();
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.navigate().to(url);

driver.quit();







		
		
	}

}
