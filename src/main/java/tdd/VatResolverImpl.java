package tdd;

import lombok.Getter;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class VatResolverImpl implements VatResolver {

    @Getter
    private double vat;


    public VatResolverImpl() {
        initVat();

    }

    private void initVat() {

        vat = bringFromWebServer();
    }

    @SneakyThrows
    private double bringFromWebServer() {
        Thread.sleep(5000);
        return 0.16;
    }
}
