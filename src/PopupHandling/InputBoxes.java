package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		Thread.sleep(10000);
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("DJ");
		//To CLick SignIn hyperlink - Approach 1
        WebElement SignInCLick = driver.findElement(By.xpath("//a[contains(text(),'Signin')]"));
        SignInCLick.click();
		//To CLick SignIn hyperlink - Approach2
		WebElement SignInCLick_1 = driver.findElement(By.linkText("Signin"));
		SignInCLick_1.click();


	}

}
