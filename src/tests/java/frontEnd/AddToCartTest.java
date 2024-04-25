package frontEnd;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.frontEnd.OpenCart;

public class AddToCartTest extends BaseTest {
    public AddToCartTest() {

    }
        @Test
        public void successfulAddToCart () {
            OpenCart.goToOpenCartPage();
            OpenCart.buyCamera();
            }
        }
