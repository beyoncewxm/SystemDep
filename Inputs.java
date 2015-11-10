import java.util.ArrayList;
import java.util.List;

public class Inputs {

	String command;

	List<String> params = new ArrayList<String>();


	public List<String> getParams() {
		return params;
	}

	public void setParams(List<String> params) {
		this.params = params;
	}

	public Inputs(String inputLine) {

		String[] commands = inputLine.split(" ");

		for (String s : commands) {

			if (command == null) {
				command = s;
			} else {
				params.add(s);

			}
		}
	}
	
	public Command getCommand(){
		
		if(this.command.equals("INSTALL")){
			return new InstallCommand();
		}else if(this.command.equals("DEPEND")){
			return new DependCommand();
		}else if(this.command.equals("REMOVE")){
			return new RemoveCommand();
		}else if (this.command.equals("LIST")){
			return new ListCommand();
		}else if(this.command.equals("END")){
			return new EndCommand();
		}
		return new ErrorCommand();
		
	}

}
