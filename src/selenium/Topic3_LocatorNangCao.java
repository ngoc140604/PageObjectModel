package selenium;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic3_LocatorNangCao {

	    WebDriver driver;

	    @BeforeClass
	    public void beforeClass() {
	        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/text-box");
	    }

	    @Test
	    public void interactLocators() {
	    	//ID
	    	driver.findElement(By.id("userName"));
	    	
	    	//tag
	    	List<WebElement> elements  = driver.findElements(By.tagName("input"));
	    	int num = elements.size();
	    	System.out.println(num);
	    	
	    
	       
	    }

	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
	}
