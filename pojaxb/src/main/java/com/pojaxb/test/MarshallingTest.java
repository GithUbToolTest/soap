package com.pojaxb.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.ibm.product.sales.ProductType;
import com.ibm.product.sales.ProductsType;
import com.ibm.product.sales.PurchaseOrderType;
import com.ibm.product.sales.ShippingAddressType;

public class MarshallingTest {

	public static void main(String[] args) throws JAXBException {
		ShippingAddressType addressType=new ShippingAddressType();
		addressType.setAddressLine1("Gauri Nagar");
		addressType.setAddressLine2("Near Jai GuruDev Kirana");
		addressType.setCountry("India");
		addressType.setState("MP");
		addressType.setZipCode(548254);
		
		ProductType productType=new ProductType();
		productType.setProductCode("BK2568");
		productType.setQuantity(22);
		
		ProductsType productsType=new ProductsType();
		productsType.getProduct().add(productType);
		
		PurchaseOrderType orderType=new PurchaseOrderType();
		orderType.setProducts(productsType);
		orderType.setShippingAddress(addressType);
		
		JAXBContext context=JAXBContext.newInstance("com.ibm.product.sales");
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);
		
		marshaller.marshal(orderType , System.out);
	}

}
