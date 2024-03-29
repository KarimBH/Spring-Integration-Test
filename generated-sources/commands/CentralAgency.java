package generated-sources.commands;

import com.oxia.khas.fwk.model.ExecutionStep;
import com.oxia.khas.fwk.transaction.Command;


public abstract class CentralAgencyCommand extends Command {

	@Override
	public Object execute() throws Exception {
		try{
			return executeInternal();
		}catch (CentralAgencyException e) {
			throw e;
		}catch (Exception e) {
			handleException(e);
		}
		return null;
	}

	private void handleException(Exception e) {
		ExecutionStep actualStep = super.getExecutionStep();
		if (actualStep != null) {
			// to do	handling exceptions
		}	
	}

	protected abstract Object executeInternal() throws Exception ;

}
