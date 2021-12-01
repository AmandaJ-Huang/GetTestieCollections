import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void testFirst() {
        // Given
        String[] fruits = {"dragonfruit", "pear", "apricot", "lychee", "kumquat"};
        TreeSet<String> treeSet = new TreeSet<>(List.of(fruits));
        String expected = "apricot";

        // When
        String actual = treeSet.first();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFloor() {
        // Given
        String[] fruits = {"dragonfruit", "pear", "apricot", "lychee", "kumquat"};
        TreeSet<String> treeSet = new TreeSet<>(List.of(fruits));
        String expected = "kumquat";

        // When
        String actual = treeSet.floor("lemons");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHeadSet() {
        // Given
        String[] fruits = {"dragonfruit", "pear", "apricot", "lychee", "kumquat"};
        TreeSet<String> treeSet = new TreeSet<>(List.of(fruits));
        String expected = "[apricot, dragonfruit]";

        // When
        String actual = treeSet.headSet("kumquat").toString();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
