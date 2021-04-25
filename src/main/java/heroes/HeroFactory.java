package heroes;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class HeroFactory {




    private List<Supplier<Hero>> heroSuppliers = List.of(
            () -> new Hobbit(),//java 8
            Elf::new,
            King::new,//java 8
            new Supplier<Hero>() { //java 7-
                @Override
                public Hero get() {
                    return new Knight();
                }
            }
    );


    public Hero createRandomHero() {
        Supplier<Hero> heroSupplier = RandomUtil.getRandomItem(heroSuppliers);
        return heroSupplier.get();
    }


}









