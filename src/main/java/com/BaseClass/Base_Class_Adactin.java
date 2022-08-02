package com.BaseClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_Adactin {


	public static WebDriver driver;
	// 1
	public static WebDriver browerLaunch(String option) {
		if(option.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
					"\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(option.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+
					"\\EdgeDriver\\edgedriver.exe");
			driver=new EdgeDriver();
		}else if(option.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+
					"\\GeckoDriver\\firefoxdriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.out.println("Invalid WebDriver");
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	// 2
	public static void getUrl(String value) {
		driver.get(value);
	}
	
	// 3
	public static void inputValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	// 4
	public static void click(WebElement element) {
		element.click();
	}
	
	// 5
	public static void clear(WebElement element) {
		element.clear();
	}
	
	// 6
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	// 7
	public static void isDisplay(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("To check whether an element is visible or available "+displayed);
	}
	
	// 8
	public static void isEnable(WebElement element) {
		boolean enable=element.isEnabled();
		System.out.println("Check whether an element is editable or not "+enable);
	}
	
	// 9
	public static void isSelect(WebElement element) {
		boolean select=element.isSelected();
		System.out.println("check whether an input element is selected or not "+select);
	}
	
	// 10
	public static void getAttribute(WebElement element, String value) {
		String attributeval = element.getAttribute(value);
		System.out.println("attribute "+attributeval);
	}
	
	// 11. close
	public static void close() {
		driver.close();
	}
	
	// 12. quit
	public static void quit() {
		driver.quit();
	}
	
	// 13. Navtigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);
		System.out.println("url "+url);
	}
	
	// 14. Navigate forward
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	// 15. Navigate back 
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	// 16. Navigate refresh -- To refresh the page
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	// 17 alert -- simple alert -- click on the ok button on the alert box using- accept
	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}
	
	// 18. alert -- prompt alert -- to cancel the alert box using- dismiss
	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	// 19. alert -- get text -- To capture the alert message
	public static void alertGetText() {
		String textval = driver.switchTo().alert().getText();
		System.out.println("text "+textval);
	}
	
	// 20. alert -- sendkeys -- To send some data to alert box
	public static void alertSendKeys(String val) {
		driver.switchTo().alert().sendKeys(val);
	}
	
	// 21. Actions -- click
	public static void mouseClick(WebElement element) {
		Actions a= new Actions(driver);
		a.click(element).build().perform();
	}
	
	// 22. Actions -- Double Click
	public static void mouseDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	
	// 23. Actions -- Right click
	public static void mouseRightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	
	// 24. sleep
	public static void sleep() throws InterruptedException {
		Thread.sleep(10);
	}
	
	//25. window handle
	public static void windowHandle() {
		String windowHandle = driver.getWindowHandle();
		String str=driver.switchTo().window(windowHandle).getTitle();
		System.out.println("window handle title "+str);
	}
	
	// 26. window handles
	public static void windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
	//	Iterator<String> iterator = windowHandles.iterator();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
	}
	
	// 27. wait
	public static void implecitylyWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	// 28. select
	public static void selectDropDown(WebElement element,String opt,String value) {
		Select s =new Select(element);
		if(opt.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if(opt.equalsIgnoreCase("index")) {
			int parseIntval = Integer.parseInt(value);
			s.selectByIndex(parseIntval);
		}else if(opt.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(value);
		}
	}
	
	// 28. deselect
		public static void deSelectDropDown(WebElement element,String opt,String value) {
			Select s =new Select(element);
			if(opt.equalsIgnoreCase("value")) {
				s.deselectByValue(value);
			}else if(opt.equalsIgnoreCase("index")) {
				int parseIntval = Integer.parseInt(value);
				s.deselectByIndex(parseIntval);
			}else if(opt.equalsIgnoreCase("visible")) {
				s.deselectByVisibleText(value);
			}
		}
		
	

}
