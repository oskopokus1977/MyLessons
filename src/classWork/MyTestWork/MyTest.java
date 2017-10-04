package classWork.MyTestWork;

import classWork.MyTestWork.ClassForTest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.ArrayList;
import java.util.List;



public class MyTest {

//    @Rule
//    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void nullObject() {
        ClassForTest object = null;
        Assert.assertNull(object);
    }

//    @Test
//    public void nullStringList() {
//        expectedException.expect(NullPointerException.class);
//        ClassForTest object = new ClassForTest();
//        List<Integer>list = object.lengthList(null);
//    }

    @Test
    public void lengthString() {
        ClassForTest test = new ClassForTest();
        List<String> listString = new ArrayList<>();
        listString.add("Yurii Kozlov");
        listString.add("Koljz ZZZ");
        listString.add("Bob");
        listString.add("Patric");
        List<Integer> list = test.lengthList(listString);
        Assert.assertEquals(list.get(3),new Integer(6));
    }

}
