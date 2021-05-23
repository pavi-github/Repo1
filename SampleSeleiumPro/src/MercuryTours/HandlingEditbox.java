package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingEditbox {

	private static final WebElement EnteredFirstName = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumJarfiles\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

String url = "http://demo.automationtesting.in/Register.html";
driver.manage().window().maximize();
driver.get(url);
//Step #1

WebElement FullName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/label"));

if(FullName.isDisplayed())
{
	String Label =FullName.getText();
	System.out.println("The full Name(Lable) is displayed:" + Label);
}

//Step #2

WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
if(FirstName.isEnabled())
{
	System.out.println("The First Name is enabled");
	FirstName.sendKeys("Pavithra");
	String EnteredFirstName = FirstName.getAttribute("value");
	
System.out.println("The First Name is:" + EnteredFirstName);
}
else
{
	System.out.println("The First Name is displayed");
}
FirstName.clear();
String EnteredFirstName = FirstName.getAttribute("value");
System.out.println("The First Name is:" + EnteredFirstName);
driver.quit();

 }

}
