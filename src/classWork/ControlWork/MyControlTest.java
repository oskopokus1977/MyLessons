package classWork.ControlWork;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MyControlTest {

    @Test
    public void readXMLPath() throws FileNotFoundException, XMLStreamException {
        MyXMLReader reader = new MyXMLReader("C:\\МОИ ДОКУМЕНТЫ\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\classWork\\ControlWork\\conf.xml");
        reader.getPuth();
        Assert.assertEquals("C:\\Files","C:\\Files");
    }
    @Test
    public void readXMLExpansion() throws FileNotFoundException, XMLStreamException {
        MyXMLReader reader = new MyXMLReader("C:\\МОИ ДОКУМЕНТЫ\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\classWork\\ControlWork\\conf.xml");
        reader.getExpansion();
        Assert.assertEquals("txt","txt");
    }

    @Test
    public void myFileScannerArr() throws IOException, XMLStreamException {
        MyFileScanner scanner = new MyFileScanner();
        Assert.assertTrue(MyFileScanner.upper.isEmpty());
        Assert.assertTrue(MyFileScanner.lower.isEmpty());
        scanner.scanLine();
        boolean isUpper = true;
        boolean isLower = true;
        for (String s : MyFileScanner.upper) {
            if (!Character.isUpperCase(s.charAt(0))) {
                isUpper = false;
            }
        }
        for (String s : MyFileScanner.lower) {
            if (!Character.isLowerCase(s.charAt(0))) {
                isLower = false;
            }
        }
        Assert.assertTrue(isUpper);
        Assert.assertTrue(isLower);
    }
    @Test
    public void writJSON(){

    }

}
