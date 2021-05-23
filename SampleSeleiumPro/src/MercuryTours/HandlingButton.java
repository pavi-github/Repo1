package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HandlingButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.ie.driver", "C:\\Automation\\SeleniumJarfiles\\IEDriverServer.exe");
	//	WebDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumJarfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement ButtonName = driver.findElement(By.name("signup"));
		String SubButtonName = ButtonName.getText();
		System.out.println("The submit button name is :" +SubButtonName);
	
		if(ButtonName.isDisplayed())
			System.out.println("The submit button name is displayed");
		
		if(ButtonName.isEnabled())
			System.out.println("The submit button name is enabled");
		driver.quit();
	}

}
