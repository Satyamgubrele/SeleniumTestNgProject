package tests;

import com.framework.base.BaseTest;
import com.framework.utils.LoggerUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.framework.pages.LoginPage;
import com.framework.pages.ProductPage;
import com.framework.utils.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest(){
        LoggerUtil.logger.info("Launching Login Test");
        LoginPage login = new LoginPage(driver);
        LoggerUtil.logger.info("Entering Username");
        login.login(ConfigReader.get("username"), ConfigReader.get("password"));

        ProductPage product = new ProductPage(driver);

        Assert.assertEquals(product.getPageTitle(), "Products");
    }

    @Test
    public void invalidLogin(){

        LoginPage login = new LoginPage(driver);

        login.login("standard_user","wrong");

        Assert.assertTrue(login.getErrormsg().contains("do not match"));
    }
    @Test
    public void emptyUsername(){

        LoginPage login = new LoginPage(driver);

        login.login("","secret_sauce");

        Assert.assertTrue(login.getErrormsg().contains("Username is required"));
    }
}