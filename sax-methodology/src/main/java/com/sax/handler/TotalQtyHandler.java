package com.sax.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TotalQtyHandler extends DefaultHandler {
	private String elementName;
	private int totalQty;

	@Override
	public void startDocument() throws SAXException {
		elementName = null;
		totalQty = 0;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		elementName = qName;
	}
	
	

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		elementName = null;
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = null;
		int quantity = 0;

		if (elementName!=null && elementName.equals("quantity")) {
			data = new String(ch, start, length);
			quantity = Integer.parseInt(data);
			totalQty += quantity;
		}
	}


	public int getTotalQty() {
		return totalQty;
	}

}
