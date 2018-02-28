import java.io.*;

public class Main {
	  public static void main(String[] args) throws IOException {
		    System.out.println("Projeto 1");
		    
		    String string;
		    
		    @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("teste.txt"));
		    while ((string = br.readLine()) != null) {
		    	StringBuilder newString = new StringBuilder(string);
		    	int x =0;
		    	while (x < newString.length()){
		    		if (newString.charAt(x) == '#') newString.setCharAt(x, 'X');
		    		x++;
		    	}
		    	System.out.println(newString);
		    }
		  }
}
