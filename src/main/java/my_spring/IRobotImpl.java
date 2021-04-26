package my_spring;

import java.rmi.dgc.DGC;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class IRobotImpl implements IRobot {


    {
        System.out.println("I robot was created");
    }


    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @Override
    public void cleanRoom(){
        speaker.speak("I started to clean the room");
        cleaner.clean();
        speaker.speak("I finished to clean the room");
    }
}
