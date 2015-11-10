import java.util.Iterator;

public class ListCommand implements Command {

	@Override
	public void execute(Inputs inputs) {

		Iterator iterator = Register.componentMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Component comp = (Component) iterator.next();

			if (comp.isInstalled()) {

				System.out.println(comp.getName());
			}
		}

	}

}
