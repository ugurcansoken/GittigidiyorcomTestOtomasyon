package Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(BasePage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginPageMethod() throws InterruptedException {
        assertUrl("https://www.gittigidiyor.com/uye-girisi?s=1");

        sendKeys(By.id("L-UserNameField"), "ugurcansoken@gmail.com");
        TimeUnit.SECONDS.sleep(1);
        sendKeys(By.id("L-PasswordField"), "ugurcansoken123+");
        TimeUnit.SECONDS.sleep(1);

        click(By.id("gg-login-enter"));
        logger.info("Giriş Yapıldı");

    }
}
