import java.util.HashMap;
import java.util.Map;



public class Register {
	
	public static Map<String, Component> componentMap = new HashMap<String, Component>();
	
	
	public static Component getComponent(String name){
		Component com = componentMap.get(name);
		if(com == null){
			com = new Component(name);
			componentMap.put(name, com);
		}
		return com;
	}
//	public void init(){
//		
//		Browser browser = new Browser();
//		componentMap.put(browser.getName(), browser);
//		
//		Dns dns = new Dns();
//		componentMap.put(dns.getName(), dns);
//		
//		Html html = new Html();
//		componentMap.put(html.getName(), html);
//		
//		NetCard netcard = new NetCard();
//		componentMap.put(netcard.getName(), netcard);
//		
//		TcpIp tcpip = new TcpIp();
//		componentMap.put(tcpip.getName(), tcpip);
//		
//		Telnet telnet = new Telnet();
//		componentMap.put(telnet.getName(), telnet);
//	}

}
