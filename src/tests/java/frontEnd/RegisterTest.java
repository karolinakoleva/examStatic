package frontEnd;

import base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.frontEnd.OpenCart;
import pages.frontEnd.Register;


public class RegisterTest extends BaseTest {
    RegisterTest() {
    }

    String emailPrefix = RandomStringUtils.randomAlphabetic(7);
    String emailSuffix = RandomStringUtils.randomAlphabetic(5);
    String email = emailPrefix + "@" + emailSuffix + ".com";

    @Test
    public void successfulRegister(){
        OpenCart.goToOpenCartPage();
        Register.successfulRegister("Karolina", "Koleva", email ,"0888888888","karolina12345","karolina12345");
        String actualMessage = Register.getMessage();
        Assert.assertEquals(actualMessage, "Your Account Has Been Created!\n" +
                "Congratulations! Your new account has been successfully created!\n" +
                "You can now take advantage of member privileges to enhance your online shopping experience with us.\n" +
                "If you have ANY questions about the operation of this online shop, please e-mail the store owner.\n" +
                "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.\n" +
                "Continue");
    }
}

