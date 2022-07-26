package rocks.zipcode.io.quiz3.fundamentals.vowelutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.VowelUtils;

/**
 * @author leon on 09/12/2018.
 */
public class HasVowels {
    @Test
    public void test() {
        test1();
        test2();
        test3();
    }

    @Test
    public void test1() {
        String input = "qwrtypsdfghjklzxcvbnm";
        Assert.assertFalse(VowelUtils.hasVowels(input));
    }

    @Test

    public void test2() {
        String input = "qwrtypsdfghjklzxcvbnma";
        Assert.assertTrue(VowelUtils.hasVowels(input));
    }

    @Test

    public void test3() {
        String input = "qwrtypsdfghjklzxcvbnm_";
        Assert.assertFalse(VowelUtils.hasVowels(input));
    }
}
