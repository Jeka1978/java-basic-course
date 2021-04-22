package howework;

import lombok.EqualsAndHashCode;

/**
 * @author Evgeny Borisov
 */
public class EpamListImpl implements EpamList {

    private Object[] content = new Object[0];

    @Override
    public void add(Object o) {


        Object[] objects = new Object[content.length + 1];
        System.arraycopy(content, 0, objects, 0, content.length);
        objects[content.length] = o;
        content = objects;

    }

    @Override
    public int size() {
        return content.length;
    }

    @Override
    public boolean remove(int i) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void printAllContext() {
        for (Object o : content) {
            System.out.println(o);
        }
    }
}






