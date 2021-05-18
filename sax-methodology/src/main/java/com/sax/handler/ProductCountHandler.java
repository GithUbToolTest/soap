package com.sax.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ProductCountHandler extends DefaultHandler{
	private int numberOfProduct;
	@Override
	public void startDocument() throws SAXException {
		numberOfProduct=0;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("product")) {
			numberOfProduct++;
		}
	}

	public int getNumberOfProduct() {
		return numberOfProduct;
	}	
}
