package generated-sources.commands;

import generated-sources.jaxb.localhost._8081.schema.AddBookingResponse;

public class AddBookingCommand extends CentralAgencyCommand{

    	private static final long serialVersionUID = 1L;
	@Override
	public Object executeInternal() throws Exception {
		
		if(logger.isDebugEnabled()){
			logger.debug(" -- execution of AddBooking" );
		}
		 AddBookingResponse response = new  AddBookingResponse();
		// TODO  setting response attributes 

		return response;
	}
	
	@Override
   	 public Boolean rollback() {
		// TODO rollback implementation
		return false;
  	  }
	
	
}
