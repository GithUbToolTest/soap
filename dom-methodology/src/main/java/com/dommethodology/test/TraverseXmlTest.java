package com.dommethodology.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TraverseXmlTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory builderFactory = null;
		DocumentBuilder builder = null;
		Document doc = null;

		builderFactory = DocumentBuilderFactory.newInstance();
		builder = builderFactory.newDocumentBuilder();
		doc = builder.parse(new File("D:\\SrimansirPractice\\Web-Services\\Jax-p\\sax\\dom-methodology\\src\\main\\resources\\po.xml"));
		printNode(doc);
	}
	
	private static void printNode(Node node) {
		if(node.getNodeType() == node.DOCUMENT_NODE) {
			printNode(node.getFirstChild());
		}else if(node.getNodeType() == node.ELEMENT_NODE) {
			System.out.print("<"+node.getNodeName()+">");
			NodeList childNode=node.getChildNodes();
			
			for(int i=0;i<childNode.getLength();i++){
				Node child=childNode.item(i);
				printNode(child);
			}
			System.out.println("</"+node.getNodeName()+">");
		}else if(node.getNodeType() == node.TEXT_NODE) {
			System.out.print(node.getNodeValue());
		}
	}
}
