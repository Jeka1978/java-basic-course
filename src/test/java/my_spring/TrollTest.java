package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TrollTest {
    @Test
    public void testInjectRandomIntIsWorking() {
        Troll troll = ObjectFactory.getInstance().createObject(Troll.class);
        System.out.println(troll);
        Assert.assertTrue(troll.getPower()<19);
        Assert.assertTrue(troll.getPower()>11);
    }
}