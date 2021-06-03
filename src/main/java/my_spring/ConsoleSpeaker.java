package my_spring;

/**
 * @author Evgeny Borisov
 */

@Benchmark
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
