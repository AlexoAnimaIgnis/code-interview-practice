package com.alexo.pseuduckcode.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VacuumCleanerRouteTest {
    private VacuumCleanerRoute vacuumCleanerRoute;
    private String LR = "LR";
    private String URURD = "URURD";
    private String RUULLDRD = "RUULLDRD";

    @Before
    public void setup() {
        vacuumCleanerRoute = new VacuumCleanerRoute();
    }

    @Test
    public void testReturnToOriginal_1() {
        boolean result = vacuumCleanerRoute.returnToOriginalPosition(LR);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testReturnToOriginal_2() {
        boolean result = vacuumCleanerRoute.returnToOriginalPosition(URURD);
        Assert.assertEquals(false, result);
    }

    @Test
    public void testReturnToOriginal_3() {
        boolean result = vacuumCleanerRoute.returnToOriginalPosition(RUULLDRD);
        Assert.assertEquals(true, result);
    }
}
