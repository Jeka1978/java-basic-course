package builder;

import java.util.HashMap;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        PolicyService policyService = PolicyService.builder()
                .driverAge(12)
                .driverExperience(10)
                .numberOfAccidence(20)
                .build();
        System.out.println(policyService);


        Student.StudentBuilder beer = Student.builder().name("Doron")
                .beer("Tuborg", 2)
                .beer("Leff", 3)
                .beer("Corona", 12);



    }
}
