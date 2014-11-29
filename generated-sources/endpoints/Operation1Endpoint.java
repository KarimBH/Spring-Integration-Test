package generated-sources.endpoints;

import org.apache.log4j.NDC;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.oxia.khas.fwk.transaction.ActiveTransaction;
import com.oxia.khas.fwk.ws.AbstractServiceEndpoint;
import generated-sources.commands.Operation1Command;
import generated-sources.jaxb.localhost._8080.targetnamespace.schema.Operation1Request;
import generated-sources.jaxb.localhost._8080.targetnamespace.schema.Operation1Response;

@Endpoint
public class Operation1Endpoint extends AbstractServiceEndpoint {

	@PayloadRoot(localPart = "Operation1Request", namespace = COMMON_NAMESPACE)
	@ResponsePayload
	public Operation1Response invokeInternal(@RequestPayload Operation1Request request) throws Exception {
		Operation1Command command = new Operation1Command();
		ActiveTransaction transaction = new ActiveTransaction(command);
		NDC.clear();
		NDC.push(transaction.getId());
		// TODO complete endpoint class implementation
		Operation1Response response = (Operation1Response)service.execute(transaction);
		NDC.clear();
		return response;
	}
	
}
