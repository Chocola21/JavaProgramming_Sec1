import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		//FileWriter filename = new FileWriter("d://txtFile//product.txt",true);
		//PrinterWriter = new PrinterWriter
		PrintStream writeFile = new PrintStream((new File("d://txtFile//product.txt")));
		System.out.print("Product Id: ");
		String productId = input.next();
		System.out.print("Product Name: ");
		String productName = input.next();
		System.out.print("Product Unit: ");
		int productUnit = input.nextInt();
		System.out.print("Product Unit: ");
		float productPrice = input.nextFloat();
		
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.print("Writer file already....");
		writeFile.close();
		
			
	}

}
