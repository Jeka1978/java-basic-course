package weak_reference;

import java.lang.ref.WeakReference;

/**
 * @author Evgeny Borisov
 */
public class SmartCacheContainer {

    private WeakReference<String> weakReference;


    public void setContent(String s) {
        weakReference = new WeakReference<>(s);
    }

    public String getContent(){
        return weakReference.get();
    }
}
