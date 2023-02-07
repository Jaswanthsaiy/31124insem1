package example;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class inlab1 {
    @Test
    public void test() {
        WebDriver driver;
        System.out.println("welcome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.github.com/login");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("login_field")).sendKeys("2000031124@kluniversity.in");
        highlight(driver,driver.findElement(By.id("login_field")));
        driver.findElement(By.name("password")).sendKeys("Wore943@bout409");
        highlight(driver,driver.findElement(By.name("password")));
        driver.findElement(By.className("header-logo"));
        highlight(driver,driver.findElement(By.className("header-logo")));
        driver.findElement(By.tagName("h1"));
        highlight(driver,driver.findElement(By.tagName("h1")));
        //driver.findElement(By.linkText("Forgot password?")).click();
        highlight(driver,driver.findElement(By.linkText("Forgot password?")));
        //driver.findElement(By.partialLinkText("Create an account")).click();



    }
    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
}