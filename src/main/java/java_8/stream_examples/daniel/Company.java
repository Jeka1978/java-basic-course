package java_8.stream_examples.daniel;

import lombok.*;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Singular
    private List<Employee> employees;

    private Seniority seniority;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }
}
