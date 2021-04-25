package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculatorTest {

    @Test
    public void withVat() {

        VatResolver mock = Mockito.mock(VatResolver.class);

        Mockito.when(mock.getVat()).thenReturn(0.2);
        System.out.println(mock.getVat());


        TaxCalculator taxCalculator = new TaxCalculator(mock);
        double withVat = taxCalculator.withVat(100);
        Assert.assertEquals(withVat,120,0.0000001);
    }


}