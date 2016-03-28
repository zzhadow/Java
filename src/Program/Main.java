package Program;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader inFile = new BufferedReader(new FileReader("file.txt"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vad heter prata på spanska?");
		String svar = sc.next();
	
		// comment
		
	String text = "";	
	String line = inFile.readLine();
	while(line != null){
	
		text += line;
		line = inFile.readLine();
		
		}
		
	System.out.println(text);
	
	inFile.close();
		

	}

}
