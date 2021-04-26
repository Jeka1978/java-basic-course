package my_spring;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class IRobotImplTest {


    public IRobotImplTest() {
        System.out.println("test object was created");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }
    @After
    public void closeAll(){

        IRobotImpl iRobot = new IRobotImpl();
        iRobot.cleanRoom();
        System.out.println("After");
    }

    @Test
    public void cleanRoom() {
        System.out.println(11111);
        Assert.assertTrue(true);
    }

    @Test
    public void name() {
        System.out.println(2222);
        Assert.assertFalse(false);
    }

    @Test
    public void name2() {
        System.out.println(33333);
        Assert.assertEquals(1,1);
    }
}




