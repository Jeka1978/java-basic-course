package java_8;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {



    public static <T> void forEachWithDelay(List<T> list,int delay/* , Action action*/){
        //todo finish
    }


    public static <T> int countDuplicates(List<T> list, T t,Equalator<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.myEquals(t,t1)) {
                counter++;
            }
        }
        return counter;
    }
}
