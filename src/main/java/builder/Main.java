package builder;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        PolicyService policyService = new PolicyService();
        policyService.setDriverAge(12);
    }
}
