package java_8.stream_examples.daniel;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtils {
    public static Map<Seniority, Long> countBySeniority(Company company) {
        return company.getEmployees().stream()
                .collect(Collectors
                        .groupingBy(employee -> Seniority.findBySalary(employee.getSalary())
                                , Collectors.counting()));
    }

    public static Seniority calcSeniority(Company company) {
        Map<Seniority, Long> map = countBySeniority(company);
        return map.entrySet().stream().max((o1, o2) -> (int) (o1.getValue() - o2.getValue()))
                .get().getKey();
    }


    public static void setCompanyStatus(List<Company> companies) {
        companies.forEach(company -> company.setSeniority(calcSeniority(company)));
    }
}





