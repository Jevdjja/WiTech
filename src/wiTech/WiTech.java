package wiTech;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WiTech {
	
	private WebDriver webDriver;

	public WiTech() {
		System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		webDriver = new ChromeDriver(options);
	}
	public void openSite(String siteUrl) {
		webDriver.get(siteUrl);
}
	public void clickAboutUs() {
		WebElement element = webDriver.findElement(By.cssSelector("#menu-item-103 > a"));
		element.click();
	}
	public void click1YearCelebration() {
		WebElement element = webDriver.findElement(By.cssSelector("li#menu-item-471 > a"));
		element.click();
	}
	public void scrollDown() {
		WebElement element = webDriver.findElement(By.cssSelector("#post-468 > div > p:nth-child(2)"));
		delay(2000);
		((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	/*
	public void clickWiteckitnetwork() {
	
		waitAndClick(By.xpath("//*[@id=\"post-468\"]/div/p[2]/text()"));
		delay(4000);
	}
	
	public ErrorCollector collector = new ErrorCollector();
	
	public void waitAndClick(By by) {
			
		try {
			Thread.sleep(1000L);
		} catch (Exception e) {
			collector.addError(e);
		}
		
		
		WebDriverWait wait = new WebDriverWait(webDriver, 10); 
		try {
		
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
			element.click();
			
		} catch (Exception e) {
			collector.addError(e);
		}
		}
		*/
		
	
		public void clickWiTechNu() {
			WebElement element = webDriver.findElement(By.cssSelector("#post-468 > div > p:nth-child(3) > a:nth-child(2)"));
			element.click();
			}	
		
		public void clickInstaLink() {
			click1YearCelebration();
			scrollDown();
			WebElement element = webDriver.findElement(By.cssSelector("#post-468 > div > p:nth-child(3) > a.mention"));
			element.click();
			
		}
		public void clickKickStarter() {
			
			WebElement element = webDriver.findElement(By.cssSelector("#menu-item-143 > a"));
			element.click();
			WebElement element2 = webDriver.findElement(By.cssSelector("#post-141 > div > h3 > a"));
			delay(2000);
			((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element2);
			element2.click();
			
		}
		
      public void clickOurSponsors() {
			
			WebElement element = webDriver.findElement(By.cssSelector("#menu-item-449 > a"));
			element.click();
      }
      
      public void clickMediaArchive() {
			
			WebElement element = webDriver.findElement(By.cssSelector("#menu-item-213 > a"));
			element.click();
    }
      

	public void delay(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
		}
}
}

