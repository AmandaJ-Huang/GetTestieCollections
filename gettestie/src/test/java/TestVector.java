import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {

    @Test
    public void testCapacity() {
        // Given
        Vector<String> vector = new Vector<>();
        Integer expected = 10;

        // When
        Integer actual = vector.capacity(); //default size is 10

        // Then
        Assert.assertEquals(expected, actual);
    }


}
