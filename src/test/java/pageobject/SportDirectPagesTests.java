package pageobject;

import org.junit.jupiter.api.Test;

public class SportDirectPagesTests {
    @Test
    public void testOnPages() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("sportsdirect.com");
    }
}
