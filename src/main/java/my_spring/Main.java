package my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        JavaConfig config = JavaConfig.builder()
                .ifc2ImplClass(Speaker.class, ConsoleSpeaker.class)
                .ifc2ImplClass(Cleaner.class, CleanerImpl.class)
                .packagesToScan("my_spring")
                .build();


        ApplicationContext context = new ApplicationContext(config);
        context.getObject(IRobot.class);
        context.getObject(IRobot.class);
        IRobot iRobot = context.getObject(IRobot.class);
        iRobot.cleanRoom();


    }
}
