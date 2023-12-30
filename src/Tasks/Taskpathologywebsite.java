package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taskpathologywebsite {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://gor-pathology.web.app/");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[1]/div/input")).sendKeys("test@kennect.io");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div[2]/div/input")).sendKeys("Qwerty@1234");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button[1]")).click();
        driver.manage().window().maximize();
        Thread.sleep(5000);
          JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(1,400)");
           Thread.sleep(3000);
           driver.findElement(By.xpath("//input[@id='patient-test']")).click();
           Thread.sleep(5000);
           
           driver.findElement(By.xpath("/html/body/div[2]/div/nav/div[2]/div/div/div/div[2]/ul/a[2]/div")).click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[1]/a[2]/button/span[1]")).click();
           driver.findElement(By.name("name")).sendKeys("jojo");
           driver.findElement(By.name("email")).sendKeys("qakn3@mailinator.com");
           driver.findElement(By.name("phone")).sendKeys("2124567833");
           driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[2]/div[2]/button[2]/span[1]")).click();
           driver.findElement(By.name("height")).sendKeys("158");
           driver.findElement(By.name("weight")).sendKeys("67");
           driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/form/div[3]/div[1]/div/div")).click();
           driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]")).click();
           driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/form/div[3]/div[2]/div/input")).sendKeys("29");
           driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/form/div[4]/div[2]/div[2]/div/input")).sendKeys("89");
           driver.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div[2]/div/div[1]/form/div[4]/div[2]/div[1]/div/input")).sendKeys("88");
           Thread.sleep(2000);
           JavascriptExecutor js1 = (JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(1,400)");
           
            
          

	}

}
