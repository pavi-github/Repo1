package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Automation\\SeleniumJarfiles\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
	

//System.setProperty("webdriver.ie.driver", "C:\\Automation\\SeleniumJarfiles\\IEDriverServer.exe");
//WebDriver driver = new InternetExplorerDriver();		
		
String url = "http://newtours.demoaut.com/mercurysignon.php";
driver.get(url);
driver.manage().window().maximize();

//step #1 - Login  & verify the title of the url
String actualTitle= driver.getTitle();
System.out.println("The actual Titile :" + actualTitle);

driver.findElement(By.name("userName")).sendKeys("mercury");
driver.findElement(By.name("password")).sendKeys("mercury");

driver.findElement(By.name("login")).click();

//Step #2 - Selecting From & To journey details
driver.findElement(By.name("fromPort")).sendKeys("Frankfurt");
driver.findElement(By.name("fromMonth")).sendKeys("February");
driver.findElement(By.name("fromDay")).sendKeys("2");

driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();

//Step#3 - Validating the Text


String ExpectedText= "Flight Details";

String ActualText= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();
System.out.println("This is the expected Value: " + ExpectedText);
System.out.println("This is the Actual Value: " + ActualText);
if(ActualText.equals(ExpectedText))
System.out.println("Expected equals Actual");
else
System.out.println("Expected not equals Actual");

//Step #4 -Verify current URL

String ActualCurrentUrl = driver.getCurrentUrl();
System.out.println("This is the current url:" +ActualCurrentUrl);

driver.quit();
	}
}
