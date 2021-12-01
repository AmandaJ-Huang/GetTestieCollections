import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {

    @Test
    public void testCeilingEntry() {
        // Given
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer[] keys = {6, 2, 5, 9, 1, 3, 7, 4, 8};
        String expected = "8=9";

        for (Integer key : keys) {
            treeMap.put(key, key+1);
        }

        // When
        //gets the smallest key >= to parameter value
        String actual = treeMap.ceilingEntry(8).toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCeilingKey() {
        // Given
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer[] keys = {2, 5, 9, 3, 7};
        Integer expected = 5;

        for (Integer key : keys) {
            treeMap.put(key, key+1);
        }

        // When
        Integer actual = treeMap.ceilingKey(4);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDescendingKeySet() {
        // Given
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer[] keys = {2, 5, 9, 3, 7};
        String expected = "[9, 7, 5, 3, 2]";

        for (Integer key : keys) {
            treeMap.put(key, key+1);
        }

        // When
        String actual = treeMap.descendingKeySet().toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLowerEntry() {
        // Given
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer[] keys = {6, 2, 5, 9, 1, 3, 7, 4, 8};
        String expected = "5=6";

        for (Integer key : keys) {
            treeMap.put(key, key+1);
        }

        // When
        String actual = treeMap.lowerEntry(6).toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPollLastEntry() {
        // Given
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Integer[] keys = {6, 2, 5, 9, 1, 3, 7, 4, 8};
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8]";

        for (Integer key : keys) {
            treeMap.put(key, key+1);
        }

        // When
        treeMap.pollLastEntry();
        String actual = treeMap
            .keySet()
            .toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
