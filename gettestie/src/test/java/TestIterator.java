import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestIterator {

    @Test
    public void testNext() {
        // Given
        List<String> fruits = new ArrayList<>();
        fruits.add("apples");
        fruits.add("oranges");
        fruits.add("grapes");

        // When
        Iterator<String> iterator = fruits.iterator();

        // Then
        Assert.assertEquals("apples", iterator.next());
        Assert.assertEquals("oranges", iterator.next());
    }

    @Test
    public void testHasNext() {
        // Given
        List<String> fruits = new ArrayList<>();
        fruits.add("apples");
        fruits.add("oranges");
        fruits.add("grapes");

        // When
        Iterator<String> iterator = fruits.iterator();

        // Then
        Assert.assertTrue(iterator.hasNext());
    }

    @Test
    public void testRemove() {
        // Given
        List<String> fruits = new ArrayList<>();
        fruits.add("apples");
        fruits.add("oranges");
        fruits.add("grapes");
        String expected = "[apples, grapes]";

        // When
        Iterator<String> iterator = fruits.iterator();
        String str = "";

        while (iterator.hasNext()) {
            str = iterator.next();
            if (str.equals("oranges")) {
                iterator.remove();
            }
        }

        String actual = fruits.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
