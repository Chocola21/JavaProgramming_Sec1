import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] number =  {78,36,58,41,25,92,75};
		System.out.print("Input index of array : ");
		int inputnum = scan.nextInt();
		while((inputnum<0)||inputnum>=number.length) {
			System.out.print("Input index of array, again : ");
			inputnum = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is " + number[inputnum]);
		if(inputnum==(number.length-1)) {
			System.out.println("Sorry,"+inputnum+"is the last index in array.");
		
		}else
			System.out.println("Value in next index is " + number[inputnum+1]);
	}
}


