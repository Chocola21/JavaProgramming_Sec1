import java.util.Scanner;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		boolean found = false ;
		Scanner input = new Scanner(System.in);
	    System.out.print("Input Email:");
	    String inputemail = input.next().toLowerCase();
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String email = readFile.next();
			if(inputemail.equals(email)){
				System.out.print("password is "+password);
				found = true ;
				break ;
			}
		}
		readFile.close();
		if(found == false) {
			System.out.print("Data not found...");
		}
	}
}