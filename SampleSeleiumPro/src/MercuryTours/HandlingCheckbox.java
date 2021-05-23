package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumJarfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement MovieCheckbox = driver.findElement(By.id("checkbox2"));
		if(MovieCheckbox.isDisplayed())
			System.out.println("Movie checkbox is displayed");
		else
			System.out.println("Movie checkbox is not displayed");
		MovieCheckbox.click();			
		if(MovieCheckbox.isSelected())
		{
			System.out.println("Movie checkbox is Selected");
		}
		else
		{
			System.out.println("Movie checkbox is not Selected");
	
		}
		
		MovieCheckbox.click();	
		if(MovieCheckbox.isSelected())
		{
		System.out.println("Movie checkbox is Selected");
		MovieCheckbox.click();
		}
		else
			System.out.println("Movie checkbox is not Selected");
		driver.quit();
		
	}
	

}
