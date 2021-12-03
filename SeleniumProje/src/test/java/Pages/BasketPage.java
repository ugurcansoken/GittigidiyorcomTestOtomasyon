package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasketPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void basketPageMethod() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        click(By.cssSelector("div[class='gg-input gg-input-select ']"));
        Select select = new Select(driver.findElement(By.cssSelector("select[class='amount']")));
        select.selectByVisibleText("2");
        logger.info("Sepetteik ürün sayısı 2 yapıldı");

        TimeUnit.SECONDS.sleep(5);
        click(By.cssSelector("input[class='gg-d-24 gg-ui-btn-primary gg-ui-btn-lg btn-pay']"));
        scrollDownTwo();
        TimeUnit.SECONDS.sleep(3);
        click(By.cssSelector("button[class='gg-ui-btn-primary gg-btn post-address gg-ui-btn-fluid post-address-button gg-ui-btn-lg']"));
        TimeUnit.SECONDS.sleep(1);

        logger.info("Kayıt sayfasındaki hatalar okundu");
        TimeUnit.SECONDS.sleep(1);
        scrollDown();
        click(By.cssSelector("a[class='header-link pl10'][href='https://www.gittigidiyor.com/sepetim']"));
        TimeUnit.SECONDS.sleep(1);


        listToClick(By.cssSelector("a[class='gg-ui-btn-default btn-add-to-basket']"), 6);
        logger.info("Favorilerimdeki ürün sepete eklendi");
        TimeUnit.SECONDS.sleep(1);

        listToClick(By.cssSelector("a[class='btn-delete']"), 6);
        logger.info("Favorilerden ürün silindi");


        TimeUnit.SECONDS.sleep(2);





    }
}
