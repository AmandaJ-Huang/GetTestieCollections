import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class TestArrayDeque {

    @Test
    public void addTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Integer expected = 4;

        // When
        arrayDeque.add("cookies");
        arrayDeque.add("donuts");
        arrayDeque.add("cakes");
        arrayDeque.add("pies");
        Integer actual = arrayDeque.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Integer expected = 3;

        // When
        arrayDeque.add("cookies");
        arrayDeque.add("donuts");
        arrayDeque.add("cakes");
        arrayDeque.add("pies");
        arrayDeque.remove();
        Integer actual = arrayDeque.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Integer expected = 0;

        // When
        arrayDeque.add("cookies");
        arrayDeque.add("donuts");
        arrayDeque.add("cakes");
        arrayDeque.add("pies");
        arrayDeque.clear();
        Integer actual = arrayDeque.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        Boolean expected = true;

        // When
        arrayDeque.add("cookies");
        arrayDeque.add("donuts");
        arrayDeque.add("cakes");
        arrayDeque.add("pies");
        Boolean actual = arrayDeque.contains("donuts");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peekTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        String expected = "cookies";

        // When
        arrayDeque.add("cookies");
        arrayDeque.add("donuts");
        arrayDeque.add("cakes");
        arrayDeque.add("pies");
        String actual = arrayDeque.peek(); // opposite of stack, returns head

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pollTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        String expectedString = "cookies";
        Integer expectedSize = 3;

        // When
        arrayDeque.add("cookies");
        arrayDeque.add("donuts");
        arrayDeque.add("cakes");
        arrayDeque.add("pies");
        String actualString = arrayDeque.poll(); // opposite of stack, returns head
        Integer actualSize = arrayDeque.size();

        // Then
        Assert.assertEquals(expectedString, actualString);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void popTest() {
        // Given
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        String expected = "donuts";

        // When
        arrayDeque.add("cookies");
        arrayDeque.add("donuts");
        arrayDeque.add("cakes");
        arrayDeque.add("pies");
        arrayDeque.pop();
        String actual = arrayDeque.peek();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
