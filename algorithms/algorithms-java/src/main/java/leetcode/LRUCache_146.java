package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache_146 extends LinkedHashMap<Integer, Integer>{
    public static void main(String[] args) {
        LRUCache_146 cache = new LRUCache_146( 2 /* capacity */ );

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));       // returns -1 (not found)
        System.out.println(cache.get(3));       // returns 3
        System.out.println(cache.get(4));       // returns 4

    }

    private int capacity;
    public LRUCache_146(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size()>capacity;
    }

    @Override
    public Integer get(Object key) {
        Integer result =  super.get(key);
        if (result == null) return -1;
        return result;
    }
}
