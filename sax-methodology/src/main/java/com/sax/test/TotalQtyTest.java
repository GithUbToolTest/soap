package com.sax.test;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import com.sax.handler.TotalQtyHandler;

public class TotalQtyTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		int totalQty=0;
		SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
		SAXParser saxParser=saxParserFactory.newSAXParser();
		
		SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema=factory.newSchema(new File("D:\\\\SrimansirPractice\\\\Web-Services\\\\Jax-p\\\\sax\\\\sax-methodology\\\\src\\\\main\\\\resources\\\\po.xsd"));
		
		Validator validator=schema.newValidator();
		validator.validate(new StreamSource(new File("D:\\\\SrimansirPractice\\\\Web-Services\\\\Jax-p\\\\sax\\\\sax-methodology\\\\src\\\\main\\\\resources\\\\po.xml")));
		
		
		TotalQtyHandler handler=new TotalQtyHandler();
		saxParser.parse(new File("D:\\\\SrimansirPractice\\\\Web-Services\\\\Jax-p\\\\sax\\\\sax-methodology\\\\src\\\\main\\\\resources\\\\po.xml"), handler);
		totalQty=handler.getTotalQty();
		System.out.println("Total Quantity of All Products: "+totalQty);
	}

}
