package com.sax.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sax.handler.ReadXmlHandler;

public class PrintXml {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
		SAXParser saxParser=saxParserFactory.newSAXParser();
		
		ReadXmlHandler handler=new ReadXmlHandler();
		saxParser.parse(new File("D:\\Sriman sir Practice\\Web-Services\\Jax-p\\sax\\sax-methodology\\src\\main\\resources\\po.xml"), handler);
	}

}
