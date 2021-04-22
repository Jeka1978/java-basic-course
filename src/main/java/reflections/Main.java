package reflections;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.setName("Tu-144");
        airplane.setMaxSpeed(850);
        ObjectAnalyzer analyzer = new ObjectAnalyzer();
        analyzer.printDataAboutClassOfYourObject(airplane);
    }
}
