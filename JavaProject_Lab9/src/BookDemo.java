import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Book b = new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title   : ");
		String title = scan.nextLine();
		System.out.print("Input book price   : ");
		float price = scan.nextFloat();
		System.out.print("Input publish year : ");
		int Publishyear = scan.nextInt();
		System.out.println();
		
		b.setTitle(title);
		b.setPrice(price);
		b.setPublishyear(Publishyear);
		System.out.print(b);
	}
	

}
