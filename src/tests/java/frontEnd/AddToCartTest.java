package frontEnd;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.frontEnd.Login;
import pages.frontEnd.OpenCart;

public class AddToCartTest extends BaseTest {
    public AddToCartTest() {

    }
        @Test
        public void successfulAddToCart () {
            OpenCart.goToOpenCartPage();
            OpenCart.buyCamera();
            String actualMessage = OpenCart.getCheckMessage();
            Assert.assertEquals(actualMessage, "Checkout");            }
        }
