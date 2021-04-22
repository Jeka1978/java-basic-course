package weak_reference;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        SmartCacheContainer container = new SmartCacheContainer();
        container.setContent(new String("JAVA"));





        System.gc();

        String content = container.getContent();
        System.out.println(content);
    }
}
