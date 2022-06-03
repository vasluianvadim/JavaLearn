package ChromeUI_Tests;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryUiTests {
    public static void main(String[] args) throws InterruptedException {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverWindows.exe");


        // Instantiate a ChromeDriver class.

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://www.saucedemo.com/");

        chromeDriver.manage().window().maximize();
        //example of WebElement
        WebElement lohinButton = chromeDriver.findElement(By.xpath("//input[@id='login-button']"));

//        WebElement productField  = chromeDriver.findElement(By.xpath("//span[@class='title']"));

        chromeDriver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        chromeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        lohinButton.click();

        Thread.sleep(2000);

        Assert.isTrue(chromeDriver.findElement(By.xpath("//span[@class='title']")).getText().equalsIgnoreCase("Products"),"Nu ne-am logat corect");

        Thread.sleep(2000);

        chromeDriver.quit();

    }
}
