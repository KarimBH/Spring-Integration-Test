package generated-sources.commands;

import generated-sources.jaxb.localhost._8080.targetnamespace.schema.Operation1Response;

public class Operation1Command extends CentralAgencyCommand{

    	private static final long serialVersionUID = 1L;
	@Override
	public Object executeInternal() throws Exception {
		
		if(logger.isDebugEnabled()){
			logger.debug(" -- execution of Operation1" );
		}
		 Operation1Response response = new  Operation1Response();
		// TODO  setting response attributes 

		return response;
	}
	
	@Override
   	 public Boolean rollback() {
		// TODO rollback implementation
		return false;
  	  }
	
	
}
