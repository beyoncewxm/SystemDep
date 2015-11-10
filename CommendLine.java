import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CommendLine {

	/**DEPEND TELNET TCPIP
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
				
		System.out.println("Please enter your command");
		
		
		while(true){
			System.out.print("> ");
			try {
				str = br.readLine();
				
			} catch (IOException e) {

				e.printStackTrace();
			}
						
			Inputs intputs = new Inputs(str);

			intputs.getCommand().execute(intputs);

		}

	}

}
