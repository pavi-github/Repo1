package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumJarfiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement CountryDropdown = driver.findElement(By.id("countries"));
		if (CountryDropdown.isDisplayed())
			System.out.println("The country drop down is displayed");
		else
			System.out.println("The country drop down is not displayed");
	
	//To Select item from the list box
		
		//Create the select object
		
	Select dropdown=new Select(CountryDropdown);
	dropdown.selectByVisibleText("Albania");
		
		WebElement SkillsDropdown = driver.findElement(By.id("Skills"));
		Select dropdown1=new Select(SkillsDropdown);
		
		dropdown1.selectByValue("Analytics");
		
		WebElement SelectCountryDropdown = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		SelectCountryDropdown.click();
		
	//	WebElement SelectCountryDropdown1 = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	//	SelectCountryDropdown1.sendKeys("Denmark");
		
		WebElement SelectCountryDropdown2 = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]"));
		Select dropdown3 = new Select(SelectCountryDropdown2);
		dropdown3.selectByIndex(3);
		
		System.out.println("The Select country drop down is displayed with:" +dropdown3);
			
		if (SelectCountryDropdown.isDisplayed())
			System.out.println("The Select country drop down is displayed");
		else
			System.out.println("The Select country drop down is not displayed");
		
		Thread.sleep(1000);
	
		
		
			
	}

	
}
