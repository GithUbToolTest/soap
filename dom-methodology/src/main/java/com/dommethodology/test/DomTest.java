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

public class DomTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory builderFactory = null;
		DocumentBuilder builder = null;
		Document document = null;
		Node childeNode=null;
		int totalQty = 0;
		int nodeQty=0;

		builderFactory = DocumentBuilderFactory.newInstance();
		builder = builderFactory.newDocumentBuilder();
		document = builder.parse(new File(
				"D:\\SrimansirPractice\\Web-Services\\Jax-p\\sax\\dom-methodology\\src\\main\\resources\\po.xml"));

		Node rootEle = document.getFirstChild();
		System.out.println(rootEle.getNodeName());

		NodeList qtyEle = document.getElementsByTagName("quantity");
		
		for (int i = 0; i < qtyEle.getLength(); i++) {
			childeNode=qtyEle.item(i);
			nodeQty=Integer.parseInt(childeNode.getFirstChild().getNodeValue());
			totalQty+=nodeQty;
		}
		
		System.out.println("Total quantity: "+totalQty);

	}

}
