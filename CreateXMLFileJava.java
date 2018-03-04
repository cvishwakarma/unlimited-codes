import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXMLFileJava {
private static final String xmlFilePath = "E:/Work Space/sample.xml";
public static void main(String args[]){
try{
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
DocumentBuilder docBuilder = dbf.newDocumentBuilder();
Document doc = docBuilder.newDocument();
Element root = doc.createElement("company");
doc.appendChild(root);
Element employee = doc.createElement("employee");
root.appendChild(employee);
Attr attr = doc.createAttribute("id");
attr.setValue("10");
employee.setAttributeNode(attr);
Element firstname = doc.createElement("firstname");
firstname.appendChild(doc.createTextNode("harry"));
root.appendChild(firstname);
TransformerFactory transformFactory = TransformerFactory.newInstance();
Transformer transform = transformFactory.newTransformer();
DOMSource domSource = new DOMSource(doc);
StreamResult sr = new StreamResult(new File(xmlFilePath));
transform.transform(domSource,sr);
System.out.println("Done Creating XML File");

}
catch(ParserConfigurationException ex){
ex.printStackTrace();
}
catch(TransformerException te){
te.printStackTrace();
}
}

}