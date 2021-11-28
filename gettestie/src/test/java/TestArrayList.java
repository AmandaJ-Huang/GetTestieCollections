import gettestie.src.main.java.rocks.zipcode.Address;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    @Test
    public void addTest() {
        // Given
        ArrayList<Address> addresses = new ArrayList<>();
        Address elmo = new Address("123 Sesame Street", "Sometown", "12345");
        Address spongebob = new Address("1 Pineapple Ave", "Bikini Bottom", "00000");
        Integer expected = 2;

        // When
        addresses.add(elmo);
        addresses.add(spongebob);
        Integer actual = addresses.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        // Given
        ArrayList<Address> addresses = new ArrayList<>();
        Address elmo = new Address("123 Sesame Street", "Sometown", "12345");
        Address spongebob = new Address("1 Pineapple Ave", "Bikini Bottom", "00000");
        Integer expected = 1;

        // When
        addresses.add(elmo);
        addresses.add(spongebob);
        addresses.remove(elmo);
        Integer actual = addresses.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOfTest() {
        // Given
        List<Integer> numberList = new ArrayList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expected = 2;

        // When
        numberList.addAll(List.of(ids));
        Integer actual = numberList.indexOf(333);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        // Given
        List<Integer> numberList = new ArrayList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expected = 444;

        // When
        numberList.addAll(List.of(ids));
        Integer actual = numberList.get(3);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest() {
        // Given
        List<Integer> numberList = new ArrayList<>();
        Integer[] ids = {111, 222, 333, 444, 555};
        Integer expected = 0;

        // When
        numberList.addAll(List.of(ids));
        numberList.clear();
        Integer actual = numberList.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest() {
        // Given
        ArrayList<String> strings = new ArrayList<>();
        Boolean expected = true;

        // When
        Boolean actual = strings.isEmpty();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
