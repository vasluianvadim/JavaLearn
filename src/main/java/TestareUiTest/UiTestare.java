package TestareUiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiTestare {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/vadimvasluian/IdeaProjects/JavaLearnn/src/main/resources/chromedriver");

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://www.saucedemo.com/");

        chromeDriver.manage().window().maximize();
        WebElement lohinButton = chromeDriver.findElement(By.xpath("//input[@name='login-button']"));
        chromeDriver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        chromeDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
        lohinButton.click();
        Thread.sleep(4000);
        chromeDriver.quit();

    }
}