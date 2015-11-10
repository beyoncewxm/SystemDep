

public class DependCommand implements Command {

	@Override
	public void execute(Inputs inputs) {
		
		
		Component mainComponent = Register.componentMap.get(inputs.getParams().get(0));
		

		for(int i=0; i<inputs.getParams().size(); i ++){
			mainComponent.setDepens(inputs.getParams().get(i));
		}
		
	}

}
