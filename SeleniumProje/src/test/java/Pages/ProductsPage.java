package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductsPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void productsPageMethod() throws InterruptedException {

        TimeUnit.SECONDS.sleep(1);
            sendKeys(By.cssSelector("input[data-cy='header-search-input']"), "kalem");
        click(By.cssSelector("button[data-cy='search-find-button']"));
        logger.info("Kalem ürünü aratıldı");


        for (int i = 1; i < 5; i++) {
            scrollDown();
            randomSelect(By.cssSelector("div[data-cy='product-favorite']"));
        }
        logger.info("Random ürün seçildi");


        click(By.cssSelector("div[class='sc-1nx8ums-0 hdMghx']"));
        sendKeys(By.cssSelector("input[data-cy='header-search-input']"), "Çanta");
        click(By.cssSelector("button[data-cy='search-find-button']"));
        logger.info("Çanta ürünü aratıldı");


        TimeUnit.SECONDS.sleep(3);
        scrollDownThree();
        click(By.xpath("(//div[@class='sc-1yvp483-0 dTGwmm'])[8]"));
        logger.info("7. ürün eklendi");

        TimeUnit.SECONDS.sleep(5);

        scrollDownThree();
        click(By.cssSelector("button[class='control-button gg-ui-button plr10 gg-ui-btn-default']"));
        TimeUnit.SECONDS.sleep(2);
        click(By.cssSelector("div[class='icon-sepet-line-wrapper']"));
    }
}
