package TestareUiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdTwoElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/vadimvasluian/IdeaProjects/JavaLearnn/src/main/resources/chromedriver");

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://www.saucedemo.com/");

        chromeDriver.manage().window().maximize();
        WebElement lohinButton = chromeDriver.findElement(By.xpath("//input[@name='login-button']"));
        chromeDriver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        chromeDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
        lohinButton.click();
        Thread.sleep(2000);

        WebElement AdToCartButton = chromeDriver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        AdToCartButton.click();
        WebElement AdToCartButton1 = chromeDriver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        AdToCartButton1.click();
        Thread.sleep(2000);

        WebElement CartButon = chromeDriver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        CartButon.click();
        Thread.sleep(2000);

        WebElement ContinueShoping = chromeDriver.findElement(By.xpath("//button[@id='continue-shopping']"));
        ContinueShoping.click();
        Thread.sleep(2000);


        Thread.sleep(3000);
        chromeDriver.quit();

    }
}
