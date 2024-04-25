package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Browser;

public class BaseTest {
    public BaseTest() {
    }

    @BeforeClass
    public static void browserSetup() {
        Browser.setup();
    }

    @AfterClass
    public static void browserTearDown() {
        Browser.tearDown();
    }
}
