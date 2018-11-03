package zzzLastSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingWithParameters
{
	/* Global Varaibles */
	WebDriver driver;
	
	String ffPath = "D:\\MyDataPlace\\ForJavaClass\\geckodriver-v0.19.0-win64\\geckodriver.exe";
	String crPath = "D:\\MyDataPlace\\ForJavaClass\\chromedriver_win32-latest\\chromedriver.exe";
	String iePath = "D:\\Zrepo\\JDrivers\\IE64-3.8.0\\IEDriverServer.exe";
	
	
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) throws InterruptedException
	{
		boolean go = false;
		String browser = browserName.toLowerCase();

		switch (browser)
		{
			case "firefox" :
				System.setProperty("webdriver.gecko.driver", ffPath);
				driver = new FirefoxDriver();
				go = true;
				break;

			case "chrome" :
				System.setProperty("webdriver.chrome.driver", crPath);
				driver = new ChromeDriver();
				go = true;
				break;

			case "ie" :
				System.setProperty("webdriver.ie.driver", iePath);
				driver = new InternetExplorerDriver();
				go = true;
				break;

			default :
				System.out.println("No Valid browser found");
				go = false;
				break;
		}
		if (go)
		{
			// driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			// Thread.sleep(1000);
			System.out.println("Title --> " + driver.getTitle());
		}
		else
		{
			System.out.println("UnExpected Error:  Unknown Browser - " + browser);
		}
	}
}
