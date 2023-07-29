package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomer_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new WebDriver();
		driver.get("https://dashboard-staging.rekalaba.com/master-data/customer/list");
		
		driver.findelement(By.name("name")).sendkeys("tester");
		driver.findelement(By.name("email")).sendKeys("tester02@gmail.com");
		driver.findelement(By.name("phoneNo")).sendKeys("082386432134");
		driver.findelement(By.name("address")).sendKeys("Jakarta Selatan");
		driver.findelement(By.name("companyName")).sendkeys("Rekalaba");
		driver.findelement(By.arialabel("SAVE"));
	
	}

}
