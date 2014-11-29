package generated-sources.commands;

import generated-sources.jaxb.localhost._8080.schema.SearchCarResponse;

public class SearchCarCommand extends CentralAgencyCommand{

    	private static final long serialVersionUID = 1L;
	@Override
	public Object executeInternal() throws Exception {
		
		if(logger.isDebugEnabled()){
			logger.debug(" -- execution of SearchCar" );
		}
		 SearchCarResponse response = new  SearchCarResponse();
		// TODO  setting response attributes 

		return response;
	}
	
	@Override
   	 public Boolean rollback() {
		// TODO rollback implementation
		return false;
  	  }
	
	
}
