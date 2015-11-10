import java.util.ArrayList;
import java.util.List;

public class Component {

	private String name;
	private boolean isInstalled = false;

	public Component(String name) {
		this.name = name;
	}

	public boolean isInstalled() {
		return isInstalled;
	}

	public void setInstalled(boolean isInstalled) {
		this.isInstalled = isInstalled;
	}

	public List<String> depens = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDepens() {
		return depens;
	}

	public void setDepens(String com) {
		this.depens.add(com);
	}

	public void install() {
		if (depens.size() > 0) {
			for (String comName : depens) {
				Register.componentMap.get(comName).install();
			}
		}
		this.isInstalled = true;
		System.out.println("\tInstalling " + this.name);
	}

	public void remove() {
		// TODO CHECK DEPENDS LIST.
		//
		// System.out.println("\t" + this.name + " is still needed.");
		System.out.println("\tRemoving " + this.name);
		this.isInstalled =  false;

	}

}