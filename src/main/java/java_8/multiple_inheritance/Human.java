package java_8.multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public class Human implements Father,Mother {
    @Override
    public void talkToChildren() {
        Mother.super.talkToChildren();
        Father.super.talkToChildren();
    }
}
