package tdd;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculator {

    @Setter
    private VatResolver vatResolver;

    public TaxCalculator(VatResolver vatResolver) {
        this.vatResolver = vatResolver;
    }


    public double withVat(double price) {
        double vat = vatResolver.getVat();
        return price * vat +price;
    }


}
