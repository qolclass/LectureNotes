package AAA_MyLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicSetup {

	public static WebDriver driver;

	public static String setupSession(String url, String browser)
	{
		String myChromePath = "D:\\Zrepo\\JDrivers\\chrm-2.37\\chromedriver.exe";
		String myFirefoxPath = "D:\\Zrepo\\JDrivers\\gecko64-0.20.0\\geckodriver.exe";
		String myIePath = "D:\\Zrepo\\JDrivers\\IE32-3.8.0\\IEDriverServer.exe";

		if (browser.equalsIgnoreCase("ch"))
		{
			System.setProperty("webdriver.chrome.driver", myChromePath);
			driver = new ChromeDriver();
		} else
			if (browser.equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.gecko.driver", myFirefoxPath);
				driver = new FirefoxDriver();
			} else
				if (browser.equalsIgnoreCase("ie"))
				{
					System.setProperty("webdriver.ie.driver", myIePath);
					driver = new InternetExplorerDriver();
				} else
				{
					return ("[Parent Class BasicSetup]:  returned ====> Invalid Browser specified: " + browser);
				}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("\nURL in use ==> " + url + "\n");

		return ("OK");

		/* **************** Your Code Starts Below ***************************/
	}

}
