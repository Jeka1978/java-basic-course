package tdd;

/**
 * @author Evgeny Borisov
 */
public class VatResolverSingleton implements VatResolver {
    private static volatile VatResolverSingleton instance;

    private VatResolverSingleton() {
    }



    public static VatResolverSingleton getInstance() {
        if (instance == null) {
            synchronized (VatResolverSingleton.class) {
                if (instance == null) {
                    instance = new VatResolverSingleton();
                }
            }

        }
        return instance;
    }


    @Override
    public double getVat() {
        return 0.16;
    }
}
