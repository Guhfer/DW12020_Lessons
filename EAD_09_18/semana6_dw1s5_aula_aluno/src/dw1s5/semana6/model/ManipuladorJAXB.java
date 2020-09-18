package dw1s5.semana6.model;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ManipuladorJAXB {
	
	private String arquivoXSD;
	
	public ManipuladorJAXB(String arquivoXSD) {
		this.arquivoXSD = arquivoXSD;
	}
    
    public <T extends Object>T ler(Class<T> clazz, InputStream inputStream) {
        T value = null;
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            
            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
            
            Schema schema = sf.newSchema(new File(arquivoXSD));
            
            Unmarshaller unmarshaller = context.createUnmarshaller();
            
            unmarshaller.setSchema(schema);
            
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            
            //Document document = builder.parse(new File(arquivo));
            Document document = builder.parse(inputStream);
            
            JAXBElement<T> element = unmarshaller.unmarshal(document, clazz);
            
            value = element.getValue();
        }
        catch(JAXBException | ParserConfigurationException | SAXException | IOException erro) {
            erro.printStackTrace();
        }
        return value;
    }
    
    public void gravar(Object object, String arquivo) {
        try {
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            
            Marshaller marshaller = context.createMarshaller();
            
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            marshaller.marshal(object, new File(arquivo));
            //marshaller.marshal(object, System.out);
        }
        catch(JAXBException erro) {
            erro.printStackTrace();
        }
    }
}
