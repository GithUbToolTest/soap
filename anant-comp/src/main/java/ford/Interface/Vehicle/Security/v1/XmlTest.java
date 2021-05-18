package ford.Interface.Vehicle.Security.v1;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ford._interface.vehicle.security.v1.GetSecurityLevelRequest;

public class XmlTest {

	public static void main(String[] args) throws JAXBException {
		String xmlString = "<GetSecurityLevelRequest xmlns=\"urn:ford/Interface/Vehicle/Security/v1\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ModuleAddress>7B1</ModuleAddress><VIN>1FM5K7FW8LGA00176</VIN><PartNumber>LB5T-19H423-AG</PartNumber><Seed>B34394E6EAF835B321DDDB5EAB0D6E74</Seed><SecurityLevel>01</SecurityLevel><TransactionId>{UUID}</TransactionId><UserID>xyz</UserID><UserType>DEALER</UserType><LanguageCode>en</LanguageCode><CountryCode>USA</CountryCode></GetSecurityLevelRequest>";

		JAXBContext jaxbContext;

		jaxbContext = JAXBContext.newInstance(GetSecurityLevelRequest.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		GetSecurityLevelRequest gs=(GetSecurityLevelRequest) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));
		
		System.out.println(gs.getUserID());
	}
}
