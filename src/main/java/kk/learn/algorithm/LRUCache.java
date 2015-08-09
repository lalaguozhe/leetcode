package kk.learn.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author yukang.chen
 * @since 8/5/15
 */
public class LRUCache {
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private LinkedHashMap<Integer, Integer> cacheMap;

    private int cacheSize = 0;

    public LRUCache(int capacity) {
        this.cacheSize = capacity;
        cacheMap = new LinkedHashMap<Integer, Integer>(cacheSize, DEFAULT_LOAD_FACTOR, true) {

            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > cacheSize;
            }
        };
    }

    public int get(int key) {
        return cacheMap.containsKey(key) ? cacheMap.get(key) : -1;
    }

    public void set(int key, int value) {
        cacheMap.put(key, value);
    }

}
