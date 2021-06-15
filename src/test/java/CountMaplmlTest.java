import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountMaplmlTest {

    @Test
    void add() {
        CountMap<Integer> countMap = new CountMaplml<>();
        countMap.add(1);
        countMap.add(3);
        countMap.add(3);
        assertEquals(2, countMap.size());
    }

    @Test
    void getCount() {
        CountMap<Integer> countMap = new CountMaplml<>();
        countMap.add(1);
        countMap.add(3);
        countMap.add(3);
        assertEquals(1, countMap.getCount(1));
        assertEquals(2, countMap.getCount(3));
    }

    @Test
    void remove() {
        CountMap<Integer> countMap = new CountMaplml<>();
        countMap.add(1);
        countMap.add(3);
        countMap.add(3);
        countMap.remove(3);
        assertEquals(1, countMap.size());
    }

    @Test
    void size() {
        CountMap<Integer> countMap = new CountMaplml<>();
        countMap.add(1);
        countMap.add(3);
        countMap.add(3);
        assertEquals(2, countMap.size());
    }

    @Test
    void addAll() {

    }

    @Test
    void toMap() {
        CountMap<Integer> countMap = new CountMaplml<>();
        countMap.add(1);
        countMap.add(3);
        countMap.add(3);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1);
        hashMap.put(3, 2);
        assertEquals(hashMap, countMap.toMap());
    }

    @Test
    void testToMap() {
        CountMap<Integer> countMap = new CountMaplml<>();
        countMap.add(1);
        countMap.add(3);
        countMap.add(3);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1);
        hashMap.put(3, 2);
        HashMap<Integer,Integer> anotherMap = new HashMap<>();
        countMap.toMap(anotherMap);
        assertEquals(hashMap, anotherMap);
    }
}