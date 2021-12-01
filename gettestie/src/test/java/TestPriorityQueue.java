import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class TestPriorityQueue {

    @Test
    public void testAdd() {
        // Given
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Integer[] numList = {2, 1254, 571, 1, 9331, 52, 852};
        Integer expected = 7;

        // When
        queue.addAll(List.of(numList));
        Integer actual = queue.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOffer() {
        // Given
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Integer[] numList = {2, 1254, 571, 1, 9331, 52, 852};
        String expected = "[1, 2, 34, 52, 571, 852, 1254, 9331]";

        // When
        queue.addAll(List.of(numList));
        queue.offer(34);
        List<Integer> queueStream = queue.stream()
            .sorted()
            .collect(Collectors.toList());
        String actual = queueStream.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPeek() {
        // Given
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Integer[] numList = {1254, 571, 9331, 52, 852};
        Integer expected = 52;

        // When
        queue.addAll(List.of(numList));
        Integer actual = queue.peek(); //

        // Then
        Assert.assertEquals(expected, actual);
    }
}
