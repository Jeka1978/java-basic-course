package java_8.stream_examples.reduce_example;

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
public class Money {
    private String currency;
    private int amount;


    public Money plusMoney(Money money) {
        return new Money("USD", money.amount + this.amount);
    }
}
