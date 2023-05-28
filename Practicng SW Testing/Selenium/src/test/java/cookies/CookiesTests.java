package cookies;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CookiesTests extends BaseTests {

    @Test
    public void testDeleteCookie(){
        var cookieManager = getCookieManager();
        Cookie cookie = cookieManager.makeCookie("optimizelyBuckets", "%7B%TD", "the-internet.herokuapp.com");
        cookieManager.deleteCookie(cookie);
        assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
    }
}
