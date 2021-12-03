package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }

        public void homePageMethod() throws InterruptedException {

            assertUrl("https://www.gittigidiyor.com/");
            click(By.cssSelector("a[class='tyj39b-5 lfsBU']"));
            logger.info("Pop-up kapatıldı");

            click(By.cssSelector("div[title='Giriş Yap']"));
            TimeUnit.SECONDS.sleep(1);


            click(By.cssSelector("a[data-cy='header-login-button']"));
        }



}
