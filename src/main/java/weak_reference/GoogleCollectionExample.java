package weak_reference;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author Evgeny Borisov
 */
public class GoogleCollectionExample {

    public static void main(String[] args) {


        Map<String, Integer> map = new WeakHashMap<>();


        Cache<String, Integer> cache = CacheBuilder.newBuilder()
                .maximumSize(10)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .expireAfterAccess(5, TimeUnit.MINUTES)
                .weakKeys()
                .build();


        cache.put("Leff",3);



    }
}
