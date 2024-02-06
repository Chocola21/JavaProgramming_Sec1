import java.util.Scanner;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
		Scanner readFile = new Scanner(new File("d://txtFile//Student.txt"));
		Header();
		int i = 1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String Fname = readFile.next().substring(0,1).toUpperCase();
			String Lname = readFile.next();
			double grade = readFile.nextDouble();
			int level = readFile.nextInt();
			System.out.println(i+"\t\t"+id+"\t"+Level(id)+"\t"+Fname+"."+Lname+"\t"+grade+"\t"+Status(grade));
		}
		readFile.close();
		
	}
	public static String Status(double grade) {
		if(grade>2.00) {
			return "Pass";
		}else if(grade >=1.00 && grade <= 2.00) {
			return "Critical";
		}else return "Retired";
	
	}
	public static String Level(String id) {
		int stLevel = Integer.parseInt(id.substring(0,2));
		int stYear = 22-stLevel;
		return stYear+"th";
	}
	public static void Header() {
		System.out.println("No. \t\tID \t\tLevel \tName \t\tGrade \tStatus");
		System.out.println("**************************************************************************");
	}
}
