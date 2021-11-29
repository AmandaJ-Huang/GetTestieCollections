import org.junit.Assert;
import org.junit.Test;

public class TestComparable {

    @Test
    public void testCompareToLess() {
        // Given
        Integer x = 20;
        Integer y = 100;
        Integer expected = -1;

        // When
        Integer actual = x.compareTo(y);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToGreater() {
        // Given
        Integer x = 20;
        Integer y = 100;
        Integer expected = 1;

        // When
        Integer actual = y.compareTo(x);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToEquals() {
        // Given
        Integer x = 20;
        Integer y = 20;
        Integer expected = 0;

        // When
        Integer actual = x.compareTo(y);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
