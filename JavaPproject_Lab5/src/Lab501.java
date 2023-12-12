import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullname = scan.nextLine();
		int space = fullname.trim().indexOf(" ");
		if(space==-1) {
			System.out.println("Incorrect Name");
			
		}else {
			
			System.out.println("Frist name: "+ (fullname.substring(0,space)).toUpperCase());
			System.out.print("Last name: "+ fullname.substring(space));
		}
	}

}
