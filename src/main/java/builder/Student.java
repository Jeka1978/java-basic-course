package builder;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    @Singular
    private Map<String,Integer> beers;


    @Singular("דג")
    private List<String> fish;

}
