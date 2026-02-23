package tests;

import com.framework.base.BaseTest;
import com.framework.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    ProductPage productPage=new ProductPage(driver);
    @Test
    public void verifyProductsPage(){

        Assert.assertEquals(productPage.getPageUrl(),productPage.productPageUrl);

    }


}
