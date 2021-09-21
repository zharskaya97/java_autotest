package ru.stqa.autotests.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.autotest.sandbox.Primes;

import static ru.stqa.autotest.sandbox.Primes.isPrime;
import static ru.stqa.autotest.sandbox.Primes.isPrimeFast;

public class PrimeTests {

    @Test
    public void testPrime() {
        Assert.assertTrue(isPrime(Integer.MAX_VALUE));
    }

    @Test
    public void testPrimeFast() {
        Assert.assertTrue(isPrimeFast(Integer.MAX_VALUE));
    }

    @Test
    public void testNonPrime() {
        Assert.assertFalse(isPrime(Integer.MAX_VALUE - 2));
    }

    @Test
    public void testPrimeWhile() {
        Assert.assertFalse(isPrime(Integer.MAX_VALUE - 2));
    }

    @Test (enabled = false)
    public void testPrimeLong() {
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(isPrime(n));
    }
}
