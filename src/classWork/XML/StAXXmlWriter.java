package classWork.XML;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StAXXmlWriter {
    public static void main(String[] args) throws IOException, XMLStreamException {

        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileWriter("D:\\MyLessons\\src\\classWork\\XML\\peopleStAXWriter.xml"));

        writer.writeStartDocument();
        writer.writeStartElement("people");

        writer.writeStartElement("human");
        writer.writeAttribute("sex","man");
        writer.writeStartElement("name");
        writer.writeCharacters("Angus Young");
        writer.writeEndElement();
        writer.writeStartElement("name");
        writer.writeCharacters("Slash");
        writer.writeEndElement();
        writer.writeStartElement("name");
        writer.writeCharacters("Keith Richards");
        writer.writeEndElement();
        writer.writeEndElement();

        writer.writeStartElement("human");
        writer.writeAttribute("sex","woman");
        writer.writeStartElement("name");
        writer.writeCharacters("Brigitte Bardot");
        writer.writeEndElement();
        writer.writeStartElement("name");
        writer.writeCharacters("Sophia Loren");
        writer.writeEndElement();
        writer.writeStartElement("name");
        writer.writeCharacters("Audrey Hepburn");
        writer.writeEndElement();
        writer.writeEndElement();

        writer.writeEndElement();
        writer.writeEndDocument();

        writer.close();
    }
}
