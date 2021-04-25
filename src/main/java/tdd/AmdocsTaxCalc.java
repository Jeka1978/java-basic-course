package tdd;

/**
 * @author Evgeny Borisov
 */
public class AmdocsTaxCalc {


    public double withMaam(double price) {
        return price + VatResolverSingleton.getInstance().getVat()*price;
    }
}
