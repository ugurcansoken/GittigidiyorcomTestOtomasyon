package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void sendKeys(By locator, String text) {
        find(locator).sendKeys(text);
    }

    public List<WebElement> findList(By locator) {
        return driver.findElements(locator);
    }

    public void listToClick(By locator, int textTwo) {
        findList(locator).get(textTwo).click();
    }


    public void randomSelect(By locator) {
        Random rand = new Random();
        findList(locator).get(rand.nextInt(findList(locator).size())).click();
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)");
    }

    public void scrollDownTwo() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
    }

    public void scrollDownThree() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,700)");
    }

    public void assertUrl(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }



}
