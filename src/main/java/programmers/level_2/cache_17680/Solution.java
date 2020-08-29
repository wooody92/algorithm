package programmers.level_2.cache_17680;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public int solution(int cacheSize, String[] cities) {
        List<String> lruCache = new ArrayList<>();
        int time = 0;

        if (cacheSize == 0) {
            return cities.length * 5;
        }
        for (String city : cities) {
            city = city.toLowerCase();
            if (lruCache.contains(city)) {
                lruCache.remove(city);
                lruCache.add(city);
                time++;
                continue;
            }
            if (lruCache.size() == cacheSize) {
                lruCache.remove(0);
            }
            lruCache.add(city);
            time += 5;
        }
        return time;
    }

    /**
     * Queue를 이용한 풀이법
     * 2가지 테스트 케이스에 통과하지 못했다.
     */
    public int solution2(int cacheSize, String[] cities) {
        Queue<String> lruCache = new ArrayDeque<>();
        int time = 0;

        for (String city : cities) {
            city = city.toLowerCase();
            if (lruCache.contains(city)) {
                lruCache = updateCache(lruCache, city);
                time++;
                continue;
            }
            if (lruCache.size() == cacheSize) {
                lruCache.poll();
            }
            lruCache.add(city);
            time += 5;
        }
        return time;
    }

    public Queue<String> updateCache(Queue<String> cache, String data) {
        int cacheSize = cache.size();
        for (int i = 0; i < cacheSize; i++) {
            String first = cache.peek();
            if (data.equals(first)) {
                cache.poll();
                continue;
            }
            cache.add(first);
            cache.poll();
        }
        cache.add(data);
        return cache;
    }
}
