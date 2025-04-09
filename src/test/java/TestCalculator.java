package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 3);
        Assert.assertEquals(result, 5, "Sum function failed");
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(2, 2);
        Assert.assertEquals(result, 0, "Sub function failed");
    }
}
