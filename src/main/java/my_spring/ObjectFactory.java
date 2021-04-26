package my_spring;

import heroes.RandomUtil;
import lombok.SneakyThrows;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory objectFactory = new ObjectFactory();
    private Config config = new JavaConfig();

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    private ObjectFactory() {
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        T t = type.getDeclaredConstructor().newInstance();

        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int value = RandomUtil.getNumberBetween(min, max);
                field.setAccessible(true);
                field.set(t,value);
            }
        }
        return t;
    }



















}
