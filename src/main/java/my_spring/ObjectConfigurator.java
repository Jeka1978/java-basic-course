package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ObjectConfigurator {

    void configure(ApplicationContext context,Object t);
}
