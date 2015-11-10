import java.util.List;



public class InstallCommand implements Command {

	@Override
	public void execute(Inputs inputs) {

		Component mainComponent = Register.componentMap.get(inputs.getParams().get(0));
		
		List<String> comList = mainComponent.getDepens();
		
		for(String name : comList){
			Register.componentMap.get(name).install();
		}
	}
}
