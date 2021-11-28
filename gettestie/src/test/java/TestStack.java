import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class TestStack {

    @Test
    public void pushTest() {
        // Given
        Stack<Person> stack = new Stack<Person>();
        Person person = new Person("Jerry", 1965);
        Integer expected = 1;

        // When
        stack.push(person);
        Integer actual = stack.size();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
