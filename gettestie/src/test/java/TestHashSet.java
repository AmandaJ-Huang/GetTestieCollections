import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class TestHashSet {

    @Test
    public void testAdd() {
        // Given
        HashSet<String> hashSet = new HashSet<>();
        Integer expected = 2;

        // When
        hashSet.add("apples");
        hashSet.add("oranges");
        Integer actual = hashSet.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSizeDuplicates() {
        // Given
        HashSet<String> hashSet = new HashSet<>();
        Integer expected = 1;

        // When
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("abc");
        Integer actual = hashSet.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClone() {
        // Given
        String[] fruits = {"apples", "oranges", "bananas", "grapes", "kiwis"};
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(fruits));

        // When
        HashSet<String> fruitClone = (HashSet<String>) hashSet.clone();
        String expected = hashSet.toString();
        String actual = fruitClone.toString();
        System.out.println(expected + "\n" + actual); // order will differ due to hash

        // Then
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void testContains() {
        // Given
        String[] fruits = {"apples", "oranges", "bananas", "grapes", "kiwis"};
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(fruits));

        // When
        boolean actual = hashSet.contains("bananas");

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testRemove() {
        // Given
        String[] fruits = {"apples", "oranges", "bananas", "grapes", "kiwis"};
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(fruits));
        Integer expected = 3;

        // When
        hashSet.remove("grapes");
        hashSet.remove("kiwis");
        Integer actual = hashSet.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
