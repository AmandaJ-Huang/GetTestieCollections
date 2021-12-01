import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    @Test
    public void testAddAll() {
        // Given
        LinkedList<Integer> linky = new LinkedList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expected = 5;

        // When
        linky.addAll(List.of(ids));
        Integer actual = linky.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFirst() {
        // Given
        LinkedList<Integer> linky = new LinkedList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expected = 111;

        // When
        linky.addAll(List.of(ids));
        Integer actual = linky.getFirst();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLast() {
        // Given
        LinkedList<Integer> linky = new LinkedList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expected = 555;

        // When
        linky.addAll(List.of(ids));
        Integer actual = linky.getLast();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClear() {
        // Given
        LinkedList<Integer> linky = new LinkedList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expected = 0;

        // When
        linky.addAll(List.of(ids));
        linky.clear();
        Integer actual = linky.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddFirst() {
        // Given
        LinkedList<Integer> linky = new LinkedList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expected = 123;

        // When
        linky.addAll(List.of(ids));
        linky.addFirst(expected);
        Integer actual = linky.getFirst();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddLast() {
        // Given
        LinkedList<Integer> linky = new LinkedList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expected = 700;

        // When
        linky.addAll(List.of(ids));
        linky.addLast(expected);
        Integer actual = linky.getLast();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPoll() {
        // Given
        LinkedList<Integer> linky = new LinkedList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expectedPoll = 111;
        Integer expectedSize = 4;

        // When
        linky.addAll(List.of(ids));
        Integer actualPoll = linky.pollFirst();
        Integer actualSize = linky.size();

        // Then
        Assert.assertEquals(expectedPoll, actualPoll);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testPollLast() {
        // Given
        LinkedList<Integer> linky = new LinkedList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expectedPoll = 555;
        Integer expectedSize = 4;

        // When
        linky.addAll(List.of(ids));
        Integer actualPoll = linky.pollLast();
        Integer actualSize = linky.size();

        // Then
        Assert.assertEquals(expectedPoll, actualPoll);
        Assert.assertEquals(expectedSize, actualSize);
    }
}
