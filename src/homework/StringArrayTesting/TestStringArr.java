package homework.StringArrayTesting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestStringArr {

    @Test
    public void objectNull() {
        StringArraySort object = new StringArraySort();
        assertNotNull(object);
    }

    @Test
    public void nullArray() {
        StringArraySort object = new StringArraySort();
        List<String> array = object.arraySort(new ArrayList<>());
        assertTrue(array.isEmpty());
    }

    @Test
    public void testSortArrayElement() {
        StringArraySort object = new StringArraySort();
        List<String> array = Arrays.asList("Java", "Jav", "Ja", "J", "");
        List<String> newArray = object.arraySort(array);
        assertNotNull(newArray);
        assertTrue(newArray.get(0).length() <= newArray.get(newArray.size() - 1).length());
    }

    @Test
    public void testArraySize() {
        StringArraySort object = new StringArraySort();
        List<String> array = Arrays.asList("Java", "Jav", "Ja", "J", "");
        List<String> newArray = object.arraySort(array);
        assertEquals(array.size(), newArray.size());
    }

    @Test
    public void testContentArrayElement() {
        StringArraySort object = new StringArraySort();
        List<String> array = Arrays.asList("Java", "Jav", "Ja", "J", "");
        List<String> newArray = object.arraySort(array);
        assertTrue(newArray.contains(array.get(4)));
    }

    @Test
    public void testOneElementSort() {
        StringArraySort object = new StringArraySort();
        List<String> array = Arrays.asList("Java");
        List<String> newArray = object.arraySort(array);
        assertEquals(array, newArray);
    }

    @Test
    public void testEquelElement() {
        StringArraySort object = new StringArraySort();
        List<String> array = Arrays.asList("Java", "NotJava", "Java", "Java");
        List<String> newArray = object.arraySort(array);
        assertFalse(array.equals(newArray));
    }
}
