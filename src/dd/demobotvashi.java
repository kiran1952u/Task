package dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demobotvashi {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://stage.rangeplus.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div[2]/div[3]/div/span/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div[2]/div[3]/ul/li[1]")).click();
        driver.findElement(By.id("grid-firstname")).sendKeys("kiran");
        driver.findElement(By.id("grid-last-name")).sendKeys("nikam");
        driver.findElement(By.id("grid-email")).sendKeys("kqa2@mailinator.com");
        driver.findElement(By.name("contactNo")).sendKeys("9137885544");
        driver.findElement(By.name("password")).sendKeys("Kiran1952@");
        driver.findElement(By.name("conPass")).sendKeys("Kiran1952@");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div/div/div[2]/div[7]/button/span")).click();
       /// driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/a/span/img")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div/div/div[2]/div[8]/p")).click();
        
        
        /// below code for login 
        driver.findElement(By.id("grid-login")).sendKeys("kqa2@mailinator.com");
        driver.findElement(By.id("grid-password")).sendKeys("Kiran1952@");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div/div[2]/div[1]/div/button/span")).click();
       // Thread.sleep(2000);
       // driver.navigate().refresh();
        
        
       
        
        	

	}

}
