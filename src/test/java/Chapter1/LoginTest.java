package Chapter1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
		String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today_pop = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		Thread.sleep(2000);
		CurrentPopulationCount(xpath_current_pop);
		todaypopulation(xpath_today_pop);
	}
	
	public static void CurrentPopulationCount(String locator)
	{
		int count=0;
		while(count<=2)
		{
			System.out.println("---------current population count-----------");
			System.out.println(count + " sec");
			if(count==3) break;	
		List<WebElement> popcount=driver.findElements(By.xpath(locator));
		
		for(WebElement e : popcount)
		{
			System.out.println(e.getText());
		}
		count++;
		}
	}
	
	public static void todaypopulation(String locator)
	{
	
		int count=0;
		while(count<=2)
		{
			System.out.println("---------current population count-----------");
			System.out.println(count + " sec");
			if(count==3) break;	
		List<WebElement> popcount=driver.findElements(By.xpath(locator));
		
		for(WebElement e : popcount)
		{
			System.out.println(e.getText());
		}
		count++;
		}
}
	
}
	
	


