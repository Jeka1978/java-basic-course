package enums.homework;

/**
 * @author Evgeny Borisov
 */
public class HttpCodeHandler {

    public void handleHttpCode(int httpCode) {
        //todo refactor and finish this method without using even one if statement

        if (httpCode > 100 && httpCode < 199) {
            System.out.println("40 lines of code is working in order to handle informational status");
        }
        if (httpCode > 200 && httpCode < 299) {
            System.out.println("35 lines of code is working in order to handle success status");
        }
        ///...


    }
}
