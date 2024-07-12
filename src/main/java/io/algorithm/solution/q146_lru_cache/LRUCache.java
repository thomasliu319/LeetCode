package io.algorithm.solution.q146_lru_cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: jian.liu
 * @Description //LRU算法实现
 * @Date: 2022/2/6 15:19
 */
public class LRUCache {

    private int capacity;

    LinkedHashMap<Integer, Integer> cache;

    public LRUCache(final int capacity) {
        this.capacity = capacity;
        cache  = new LinkedHashMap<Integer, Integer>(capacity, 0.75F, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
//        return cache.getOrDefault(key, -1);
        return 0;
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }

}