package tdd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class AmdocsTaxCalcTest {

    @Test
    public void withMaam() {
        AmdocsTaxCalc amdocsTaxCalc = new AmdocsTaxCalc();
        double withMaam = amdocsTaxCalc.withMaam(100);
        Assert.assertEquals(withMaam, 117,0.00001);
    }
}