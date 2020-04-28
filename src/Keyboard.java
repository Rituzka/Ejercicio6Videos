import java.io.IOException;
import java.util.Scanner;

public class Keyboard {
	
	Scanner input;
	
	
	public Keyboard() {
		input = new Scanner(System.in);
	}
	
	public String getString(String title) throws IOException {
		String s1 = "";
		
		 while (s1.isEmpty()){
		System.out.println(title);
		s1 = input.nextLine();
		
		if(s1.isEmpty()) {
	       throw new IOException("No puedes dejar campos vacíos");
				}
		}
		 
		return s1;
		
	}

}
