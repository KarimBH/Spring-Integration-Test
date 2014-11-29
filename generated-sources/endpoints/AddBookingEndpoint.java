package generated-sources.endpoints;

import org.apache.log4j.NDC;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.oxia.khas.fwk.transaction.ActiveTransaction;
import com.oxia.khas.fwk.ws.AbstractServiceEndpoint;
import generated-sources.commands.AddBookingCommand;
import generated-sources.jaxb.localhost._8081.schema.AddBookingRequest;
import generated-sources.jaxb.localhost._8081.schema.AddBookingResponse;

@Endpoint
public class AddBookingEndpoint extends AbstractServiceEndpoint {

	@PayloadRoot(localPart = "AddBookingRequest", namespace = COMMON_NAMESPACE)
	@ResponsePayload
	public AddBookingResponse invokeInternal(@RequestPayload AddBookingRequest request) throws Exception {
		AddBookingCommand command = new AddBookingCommand();
		ActiveTransaction transaction = new ActiveTransaction(command);
		NDC.clear();
		NDC.push(transaction.getId());
		// TODO complete endpoint class implementation
		AddBookingResponse response = (AddBookingResponse)service.execute(transaction);
		NDC.clear();
		return response;
	}
	
}
