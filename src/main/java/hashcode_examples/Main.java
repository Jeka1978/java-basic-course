package hashcode_examples;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        Car car3 = car;

        System.out.println("car vs car2 " + (car.equals(car2)));
        System.out.println("car vs car3 " + (car.equals(car3)));
        System.out.println("car2 vs car3 " + (car2.equals(car3)));


        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
