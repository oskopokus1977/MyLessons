package classWork.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

import static org.w3c.dom.Node.ELEMENT_NODE;

public class CarsDomParse {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        File inputFile = new File("D:\\MyLessons\\src\\classWork\\XML\\Cars.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = dbFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(inputFile);
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("car");
        for (int i = 0; i<nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node.hasAttributes()){
                Node n = node.getAttributes().getNamedItem("id");
                System.out.println(n);
            }
            NodeList children = node.getChildNodes();
            for (int j = 0; j<children.getLength(); j++) {
                Node child = children.item(j);
               System.out.println(child.getNodeName()+": "+child.getTextContent());
//                if (child.getNodeName().equals(Node.ELEMENT_NODE)){
//                System.out.println(child.getTextContent()+": "+ child.getNodeName());
//
//                }
            }

        }


    }
}
