package my_spring;

import java.rmi.dgc.DGC;

/**
 * @author Evgeny Borisov
 */
public class IRobotImpl implements IRobot {


    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);

    @Override
    public void cleanRoom(){
        speaker.speak("I started to clean the room");
        cleaner.clean();
        speaker.speak("I finished to clean the room");
    }
}
