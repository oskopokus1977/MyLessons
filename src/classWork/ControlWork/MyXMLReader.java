package classWork.ControlWork;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyXMLReader {
    String path;

    public MyXMLReader(String path) {
        this.path = path;
    }

    public String getPuth() throws FileNotFoundException, XMLStreamException {
        String puthFile = null;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader reader = factory.createXMLEventReader(new FileInputStream(path));
        while (reader.hasNext()) {
            XMLEvent xmlEvent = reader.nextEvent();
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("directory")) {
                    xmlEvent = reader.nextEvent();
                    puthFile = xmlEvent.asCharacters().getData();
                }
            }
        }
        return puthFile;
    }

    public String getExpansion() throws FileNotFoundException, XMLStreamException {
        String expansion = null;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader reader = factory.createXMLEventReader(new FileInputStream(path));
        while (reader.hasNext()) {
            XMLEvent xmlEvent = reader.nextEvent();
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("extension")) {
                    xmlEvent = reader.nextEvent();
                    expansion = xmlEvent.asCharacters().getData();
                }
            }
        }
        return expansion;
    }
}