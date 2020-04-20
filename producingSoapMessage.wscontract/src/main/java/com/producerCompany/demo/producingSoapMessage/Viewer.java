package com.producerCompany.demo.producingSoapMessage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author tadlakha
 *
 */
@WebService(name="ViewerService", portName="ViewerPort")
@SOAPBinding(style=Style.RPC)
public interface Viewer {

	
	/**
	 * @param documentId
	 * @return
	 */
	@WebMethod(operationName="getRelease")
	public int getRelease(@WebParam(name="documentId") String documentId);
}
