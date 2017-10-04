package classWork.XML;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DomXmlWriter {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Element peopleElement = document.createElement("people");
        document.appendChild(peopleElement);

        Element humanMan = document.createElement("human");
        Attr atrMan = document.createAttribute("sex");
        atrMan.setValue("man");
        humanMan.setAttributeNode(atrMan);
        peopleElement.appendChild(humanMan);

        Element humanMan1 = document.createElement("name");
        humanMan1.appendChild(document.createTextNode("Angus Young"));
        humanMan.appendChild(humanMan1);
        Element humanMan2 = document.createElement("name");
        humanMan2.appendChild(document.createTextNode("Slash"));
        humanMan.appendChild(humanMan2);
        Element humanMan3 = document.createElement("name");
        humanMan3.appendChild(document.createTextNode("Keith Richards"));
        humanMan.appendChild(humanMan3);

        Element humanWoman = document.createElement("human");
        Attr atrWoman = document.createAttribute("sex");
        atrWoman.setValue("woman");
        humanWoman.setAttributeNode(atrWoman);
        peopleElement.appendChild(humanWoman);

        Element humanWoman1 = document.createElement("name");
        humanWoman1.appendChild(document.createTextNode("Brigitte Bardot"));
        humanWoman.appendChild(humanWoman1);

        Element humanWoman2 = document.createElement("name");
        humanWoman2.appendChild(document.createTextNode("Sophia Loren"));
        humanWoman.appendChild(humanWoman2);

        Element humanWoman3 = document.createElement("name");
        humanWoman3.appendChild(document.createTextNode("Audrey Hepburn"));
        humanWoman.appendChild(humanWoman3);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("D:\\HILLEL.HOMEWORK\\JavaElementary\\HomeWork\\hillel.homework\\src\\edu\\hillel\\javaElementary\\classWork\\XML\\peopleDOMWriter.xml"));
        transformer.transform(source, result);
    }
}
