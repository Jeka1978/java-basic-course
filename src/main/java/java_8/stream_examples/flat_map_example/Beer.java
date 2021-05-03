package java_8.stream_examples.flat_map_example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Beer implements Comparable<Beer> {
    private String name;
    private int price;

    @Override
    public int compareTo(Beer o) {
        return this.price - o.price;
    }
}
