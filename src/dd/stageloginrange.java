package dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class stageloginrange {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://stage.rangeplus.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div[2]/div[3]/div/span/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div[2]/div[3]/ul/li[2]/button")).click();
        driver.findElement(By.id("grid-login")).sendKeys("kqa2@mailinator.com");
        driver.findElement(By.name("passWord")).sendKeys("Kiran1952@");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[7]/div/div/div[2]/div[1]/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[22]/div[1]/div[2]/div[2]/div[2]/a[1]/div/span")).click();
        driver.findElement(By.className("inline-block text-sm font-bold leading-5 mr-1 select-none pr-[0.1rem]")).click();
       // WebElement bot = driver.findElement(By.className("inline-block text-sm font-bold leading-5 mr-1 select-none pr-[0.1rem]"));
      //  bot.sendKeys("")
        
        

	}

}
