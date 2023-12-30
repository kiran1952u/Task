package dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkarttest {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.linkText("Login")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img")).click();
        WebElement bot = driver.findElement(By.name("q"));
        bot.sendKeys("shoes");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg/g/path[2]")).click();
	}

}
