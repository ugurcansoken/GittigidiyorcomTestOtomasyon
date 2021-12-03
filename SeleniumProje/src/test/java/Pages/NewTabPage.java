package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class NewTabPage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public NewTabPage(WebDriver driver) {
        super(driver);
    }

    public void newTabPageMethod() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("window.open('about:blank', '-blank')");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.gittigidiyor.com");
        click(By.cssSelector("div[name='profile']"));
        logger.info("Yeni sekme açıldı");


        TimeUnit.SECONDS.sleep(1);
        click(By.xpath("( //a[@class='sc-84am1q-0 sc-1r48nyr-0 dGMkVn sc-12t95ss-6 jfpyWy'])[16]"));
        logger.info("Çıkış yapıldı");
    }
}
