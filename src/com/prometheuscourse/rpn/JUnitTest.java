package com.prometheuscourse.rpn;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class JUnitTest {
    @Test
    public void parseTest() {
        assertEquals(0, Double.compare(2100D, Application.parse("10 20 + 30 40 + *")));
        assertEquals(0, Double.compare(610D, Application.parse("10 20 30.0 * +")));
        assertEquals(0, Double.compare(3D, Application.parse("50 40 + 10 20 + /")));
        assertEquals(0, Double.compare(-590D, Application.parse("10 20 30.0 * -")));
    }

    @Test
    public void argsRPNParserExceptionTest() {
        String[][] args = {null,
                {},
                {null},
                {""}};
        for (String[] arg :
                args) {
            try {
                Application.main(arg);
                fail(Arrays.toString(arg));
            } catch (RPNParserException e) {
            }
        }
    }

    @Test
    public void RPNParserExceptionTest() {
        String[] strings = {"10 20 30 () +",
                "10 20 Е * +",
                "10 + 30 * 40",
                "10 20 + 30 40 + "};
        for (String s :
                strings) {
            try {
                Application.parse(s);
                fail(s);
            } catch (RPNParserException e) {
            }
        }
    }

    @Test
    public void ArithmeticExceptionTest() {
        String[] strings = {"25 0 /"};
        for (String s :
                strings) {
            try {
                Application.parse(s);
                fail(s);
            } catch (ArithmeticException e) {
            }
        }
    }
}
