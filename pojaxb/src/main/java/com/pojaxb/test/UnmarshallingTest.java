package com.pojaxb.test;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import com.ibm.product.sales.PurchaseOrderType;

public class UnmarshallingTest {

	public static void main(String[] args) throws JAXBException, SAXException {
		SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema=factory.newSchema(new File("D:\\SrimansirPractice\\Web-Services\\jax-b\\pojaxb\\src\\main\\resources\\po.xsd"));
		
		JAXBContext jaxbContext=JAXBContext.newInstance("com.ibm.product.sales");
		Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
		unmarshaller.setSchema(schema);
		
		JAXBElement<?> jaxbElement=(JAXBElement<?>) unmarshaller.unmarshal(new File("D:\\SrimansirPractice\\Web-Services\\jax-b\\pojaxb\\src\\main\\resources\\po.xml"));
		
		PurchaseOrderType po=(PurchaseOrderType) jaxbElement.getValue();
		
		System.out.println(po.getShippingAddress().getAddressLine1());
		po.getProducts().getProduct().forEach(product -> System.out.println("Quantity : "+product.getQuantity()));
	}

}
