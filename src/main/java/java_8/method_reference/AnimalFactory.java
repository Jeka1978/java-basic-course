package java_8.method_reference;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {

    public List<Supplier<Animal>> suppliers = List.of(
            () -> new Cat(),
            Dog::new
    );
}
