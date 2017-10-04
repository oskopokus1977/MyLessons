package classWork.XML;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class SchemaXSD {
    public static void main(String[] args) throws SAXException, IOException {

        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(new File("D:\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\classWork\\XML\\ShemeXSD.xsd"));
        Validator validator = schema.newValidator();
        validator.validate(new StreamSource(new File("D:\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\classWork\\XML\\peopleDOMWriter.xml")));
        validator.validate(new StreamSource(new File("D:\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\classWork\\XML\\peopleStAXWriter.xml")));

    }
}
