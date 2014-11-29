package generated-sources.endpoints;

import org.apache.log4j.NDC;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.oxia.khas.fwk.transaction.ActiveTransaction;
import com.oxia.khas.fwk.ws.AbstractServiceEndpoint;
import generated-sources.commands.SearchCarCommand;
import generated-sources.jaxb.localhost._8080.schema.SearchCarRequest;
import generated-sources.jaxb.localhost._8080.schema.SearchCarResponse;

@Endpoint
public class SearchCarEndpoint extends AbstractServiceEndpoint {

	@PayloadRoot(localPart = "SearchCarRequest", namespace = COMMON_NAMESPACE)
	@ResponsePayload
	public SearchCarResponse invokeInternal(@RequestPayload SearchCarRequest request) throws Exception {
		SearchCarCommand command = new SearchCarCommand();
		ActiveTransaction transaction = new ActiveTransaction(command);
		NDC.clear();
		NDC.push(transaction.getId());
		// TODO complete endpoint class implementation
		SearchCarResponse response = (SearchCarResponse)service.execute(transaction);
		NDC.clear();
		return response;
	}
	
}
