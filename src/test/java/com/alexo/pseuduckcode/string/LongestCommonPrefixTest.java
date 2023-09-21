package com.alexo.pseuduckcode.string;


import org.junit.Assert;
import org.junit.Test;

/**
 *   ["colorado", "color", "cold"], return "col"
 *   ["a", "b", "c"], return ""
 *   ["spot", "spotty", "spotted"], return "spot"
 */
public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void test_shouldReturn_Col() {
        String input[] = {"colorado","color","cold"};
        String result = longestCommonPrefix.solution(input);
        Assert.assertEquals("col", result);
    }

    @Test
    public void test_shouldReturn_Spotty() {
        String input[] = {"spot", "spotty", "spotted"};
        String result = longestCommonPrefix.solution(input);
        Assert.assertEquals("spot", result);
    }

    @Test
    public void test_ShouldReturn_Empty() {
        String input[] = {"a", "b", "c"};
        String result = longestCommonPrefix.solution(input);
        Assert.assertEquals("", result);
    }

}
