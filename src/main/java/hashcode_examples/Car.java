package hashcode_examples;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

/**
 * @author Evgeny Borisov
 */

public class Car {
    private String modelName= "Toyota";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(modelName, car.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName);
    }
}


