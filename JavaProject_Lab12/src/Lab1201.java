import java.util.Scanner;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			String Fname = readFile.next();
			String Lname = readFile.next().substring(0,1);
			readFile.next();	
			readFile.next();
			String email = readFile.next().toUpperCase(); 
			System.out.println(Lname+"."+Fname+" "+"("+email +")");
		}
		//close file
		readFile.close();
	}


}


