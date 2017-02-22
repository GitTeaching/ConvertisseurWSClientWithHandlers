import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;


public class IPAddressInjectHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("\nClient : handleMessage ...");
		
		boolean isRequest = (boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		
		if(isRequest) {
						
			try {
				
				SOAPMessage soapMsg = context.getMessage();
			    SOAPPart soapPart = soapMsg.getSOAPPart();
				SOAPEnvelope soapEnv = soapPart.getEnvelope();
				SOAPHeader soapHeader = soapEnv.getHeader();
				
				if(soapHeader==null)
					soapHeader = soapEnv.addHeader();
				
				SOAPHeaderElement headerElement = soapHeader.addHeaderElement(new QName("http://tp8.ws.soa.org/", "ipAddress"));
				
				headerElement.addTextNode("127.0.0.1");
				
				soapMsg.saveChanges();
				
				System.out.println();
				soapMsg.writeTo(System.out);
				System.out.println();
				
			} catch (SOAPException | IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("\nClient : handleFault ...");
		return true;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("\nClient : close ...");

	}

	@Override
	public Set<QName> getHeaders() {
		System.out.println("\nClient : getHeaders ...");
		return null;
	}

}
