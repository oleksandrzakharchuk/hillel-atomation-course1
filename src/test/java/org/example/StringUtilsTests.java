package org.example;

import org.example.utils.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringUtilsTests {

    @Test
    public void testRandomAlphaString() {
        String randomString = StringUtils.randomString(StringUtils.StringMode.ALPHA, 10);
        assertTrue(randomString.length() == 10);
        assertTrue(randomString.matches("[a-z]*"));
    }

    @Test
    public void testRandomNumericString() {
        String randomString = StringUtils.randomString(StringUtils.StringMode.NUMERIC, 10);
        assertTrue(randomString.length() == 10);
        assertTrue(randomString.matches("[0-9]*"));

    }

    @Test
    public void testRandomAlphaNumericString() {
        String randomString = StringUtils.randomString(StringUtils.StringMode.ALPHANUMERIC, 10);
        assertTrue(randomString.length() == 10);
        assertTrue(randomString.matches("[a-z0-9]*"));
    }

    @Test
    public void testEmptyString() {
        String randomString = StringUtils.randomString(StringUtils.StringMode.ALPHANUMERIC, 0);
        assertTrue(randomString.length() == 0);
        assertTrue(randomString.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalMode() {
        StringUtils.randomString(StringUtils.StringMode.valueOf("alpha"), 10);

    }

    @Test
    public void testInvalidString() {
        String randomString = StringUtils.randomString(StringUtils.StringMode.NUMERIC, -1);
        assertTrue(randomString.length() == 0);
        assertTrue(randomString.isEmpty());
    }
}
