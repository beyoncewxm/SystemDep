
public class RemoveCommand implements Command {

	@Override
	public void execute(Inputs inputs) {
		
		Component component = Register.componentMap.get(inputs.getParams().get(0));

		component.remove();
		
	}

}
