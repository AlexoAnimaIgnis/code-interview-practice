package com.alexo.pseuduckcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * s = "ab#c", t = "ad#c", return true
 * s = "ab##", t = "c#d#", return true
 * s = "a#c", t = "b", return false
 */
public class BackspaceCompareTest {

    private BackspaceCompare backspaceCompare = new BackspaceCompare();

    @Test
    public void test_shouldReturn_True1() {
        Assert.assertTrue(
                backspaceCompare.twoPointers(
                        "ab#c",
                        "ad#c"
                )
        );
    }

    @Test
    public void test_ShouldReturn_True2() {
        Assert.assertTrue(
                backspaceCompare.twoPointers(
                        "ab##",
                        "c#d#"
                )
        );
    }

    @Test
    public void test_ShouldReturn_False() {
        Assert.assertFalse(
                backspaceCompare.twoPointers(
                        "a#c",
                        "b"
                )
        );
    }
}
