package Test;

import Pages.*;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;


public class AppTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    ProductsPage productsPage;

    BasketPage basketPage;
    NewTabPage newTabPage;

    @Test
    public void appTest() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.homePageMethod();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginPageMethod();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.productsPageMethod();
        BasketPage basketPage = new BasketPage(driver);
        basketPage.basketPageMethod();
        NewTabPage newTabPage = new NewTabPage(driver);
        newTabPage.newTabPageMethod();
    }

}
