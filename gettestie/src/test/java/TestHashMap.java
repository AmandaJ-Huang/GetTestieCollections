import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    @Test
    public void testPut() {
        // Given
        Map<Integer, String> map = new HashMap<>();
        String expected = "oranges";

        // When
        map.put(2, expected);
        String actual = map.get(2);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testKeySet() {
        // Given
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i*2);
        }
        String expected = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]";

        // When
        String actual = map.keySet().toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsKey() {
        // Given
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i*2);
        }

        // Then
        Assert.assertTrue(map.containsKey(5));
    }

    @Test
    public void testContainsValue() {
        // Given
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i*2);
        }

        // Then
        Assert.assertTrue(map.containsValue(18));
    }

    @Test
    public void testRemove() {
        // Given
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i*2);
        }
        Integer expected = 9;

        // When
        map.remove(5);
        Integer actual = map.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplace() {
        // Given
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i*2);
        }
        Integer keyToReplace = 4;
        Integer expected = 80;

        // When
        map.replace(keyToReplace, expected);
        Integer actual = map.get(keyToReplace);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEmpty() {
        // Given
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i*2);
        }

        // When
        Boolean actual = map.isEmpty();

        // Then
        Assert.assertFalse(actual);
    }
}
