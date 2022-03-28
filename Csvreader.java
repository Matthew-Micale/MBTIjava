import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class snippet {
public static void main (String [] arg) throws IOException {
	
	File csvfile = new File("C:\\Users\\alber\\Documents\\Book1.csv");
	BufferedReader br = new BufferedReader( new FileReader(csvfile));
	String line = "";
	ArrayList<String> questions = new ArrayList<String>(0);
	ArrayList<String> weight = new ArrayList<String>(0);
	ArrayList<String> t1 = new ArrayList<String>(0);
	ArrayList<String> t2 = new ArrayList<String>(0);
	
	try {
		
		while((line =br.readLine())!= null) {
			String[] count = line.split(",");
			questions.add(count[0]);
			weight.add(count[3]);
			t1.add(count[1]);
			t2.add(count[2]);
			
		}
		
		
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}
System.out.println("questions"+questions);
System.out.println("weight"+weight);
System.out.println("traits"+t1 + " " +t2+ "");
}
}


