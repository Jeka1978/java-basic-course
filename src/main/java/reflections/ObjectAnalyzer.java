package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class ObjectAnalyzer {

    public void printDataAboutClassOfYourObject(Object o) {
        Class<?> clazz = o.getClass();
        String simpleName = clazz.getSimpleName();
        System.out.println("simpleName = " + simpleName);
        String className = clazz.getName();
        System.out.println("className = " + className);


        System.out.println("*********** mehtods info *******************");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            String name = method.getName();
            System.out.println("name = " + name);
            Class<?> returnType = method.getReturnType();
            System.out.println("returnType = " + returnType);
        }
        System.out.println("*********** mehtods info end *******************");

        System.out.println("******************  fields info *************");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getType());
        }

    }
}








