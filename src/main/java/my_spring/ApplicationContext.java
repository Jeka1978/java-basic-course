package my_spring;

/**
 * @author Evgeny Borisov
 */
public class ApplicationContext {



    public Object getObject(Class type) {
        //todo finish this
        // context should cache all objects, which class marked by @Singleton
        // in case object is not singleton, or still not present in cache
        // use ObjectFactory to create
        return null;
    }
}
