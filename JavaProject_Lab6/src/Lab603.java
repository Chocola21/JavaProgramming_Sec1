import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Please enter yourname, separated by a space ");
		String fullname = name.nextLine();
		String firstname = fullname.substring(0, fullname.indexOf(" "));
		String abbreviatName = abbreviatName(fullname);
		System.out.println(abbreviatName + " " + firstname);     
	}
	 
	public static String abbreviatName(String fullname) {
		for(int i = 0; i < fullname.length(); i++) {
			if(fullname.charAt(i) == ' ') {
				return fullname.charAt(i + 1) + "." + fullname.charAt(i + 6);
			}
		}
			
			return fullname.substring(0, fullname.indexOf(" "));
		}
	}