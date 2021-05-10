package java_8.stream_examples.daniel;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                Employee.builder().name("Dany").salary(24).build(),
                Employee.builder().name("Targarien").salary(34).build(),
                Employee.builder().name("Stark").salary(41).build(),
                Employee.builder().name("Legolas").salary(41).build(),
                Employee.builder().name("Stark").salary(12).build());





        List<Employee> employees2 = List.of(
                Employee.builder().name("Dany").salary(4).build(),
                Employee.builder().name("Targarien").salary(34).build(),
                Employee.builder().name("Stark").salary(41).build(),
                Employee.builder().name("Legolas").salary(41).build(),
                Employee.builder().name("Stark2").salary(12).build(),
                Employee.builder().name("Stark3").salary(12).build(),
                Employee.builder().name("Stark4").salary(12).build());


        List<Company> companies = List.of(new Company(employees), new Company(employees2));

        EmployeeUtils.setCompanyStatus(companies);

        System.out.println();









    }
}






