package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumJarfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement FemaleRadio = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		if(FemaleRadio.isDisplayed())
			System.out.println("Female Radio is displayed");
		else
			System.out.println("Female Radio is not displayed");
		FemaleRadio.click();			
		if(FemaleRadio.isSelected())
		{
			System.out.println("Female Radio is Selected");
		}
		else
		{
			System.out.println("Female Radio is not Selected");
	
		}
		WebElement MaleRadio = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		
		MaleRadio.click();	
		if(FemaleRadio.isSelected()) 
		{
		System.out.println("Male  radio is Selected");
		
		}
		else
			System.out.println("Female radio is not Selected");	
	}

}
