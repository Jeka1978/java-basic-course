package java_8.stream_examples.daniel;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Seniority {

    JUNIOR(Integer.MIN_VALUE, 14),
    MIDDLE(15, 21),
    SENIOR(22, Integer.MAX_VALUE);

    private final int min, max;


    public static Seniority findBySalary(int salary) {
        return Arrays.stream(values())
                .filter(seniority -> seniority.min <= salary)
                .filter(seniority -> seniority.max >= salary)
                .findAny().get();
    }

}














