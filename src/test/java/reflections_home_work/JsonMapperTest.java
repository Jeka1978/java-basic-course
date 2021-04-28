package reflections_home_work;

import model.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class JsonMapperTest {

    @Test
    public void testToJson() {
        Person person = new Person("Jeka", 42);
        String json = JsonMapper.convertToJson(person);
        System.out.println("json = " + json);
      /*  Person person1 = JsonMapper.convertFromJson(json, Person.class);
        Assert.assertEquals(person, person1);*/
    }

    @Test
    public void testFromJson() {
        String json = "{\"name\": \"Jeka\",\"age\": 42}";
        Person person = JsonMapper.convertFromJson(json, Person.class);
        Assert.assertEquals(42,person.getAge());
        Assert.assertEquals("Jeka",person.getName());
        System.out.println(person);
    }














}