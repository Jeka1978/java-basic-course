package reflections_home_work;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.StringJoiner;

/**
 * @author Evgeny Borisov
 */
public class JsonMapper {


    @SneakyThrows
    public static <T> T convertFromJson(String json, Class<T> type) {
        T object = type.getDeclaredConstructor().newInstance();
        String[] split = json.replaceAll("[{}\" ]", "").split(",");
        for (String s : split) {
            String[] tuple = s.split(":");
            Field field = type.getDeclaredField(tuple[0]);
            field.setAccessible(true);
            if (field.getType().equals(String.class)) {
                field.set(object,tuple[1]);
            }else {
                if (field.getType().equals(int.class)) {

                    field.set(object, Integer.parseInt(tuple[1]));
                }
            }
        }
        return object;


//        json.replaceAll("[{}]","")

    }

    @SneakyThrows
    public static String convertToJson(Object object) {


        StringJoiner sj = new StringJoiner(",", "{", "}");
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            System.out.println("fieldName = " + fieldName);
            field.setAccessible(true);
            String valueAsString = field.get(object).toString();
            System.out.println("valueAsString = " + valueAsString);
            String leftSide = "\"" + fieldName + "\"";
            String rightSide = valueAsString;
            StringJoiner sjPair = new StringJoiner(":");
            sjPair.add(leftSide);
            if (field.getType().equals(String.class)) {
                sj.add("\"").add(rightSide).add("\"");
            } else {
                sjPair.add(rightSide);
            }
            sj.add(sjPair.toString());
        }
        System.out.println(" ==> " + sj.toString());
        return sj.toString();

/*


        StringJoiner sb = new StringJoiner("{");
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            sb.add("\"");
            sb.add(field.getName());
            sb.add("\":");
            if (field.getType().equals(String.class)) {
                sb.add("\"").add(field.get(object).toString()).add("\"");
            }else {
                sb.add(field.get(object).toString());
            }
            sb.add(",");
        }
        sb.

*/

    }
}
