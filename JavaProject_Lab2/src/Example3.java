import java.text.*;
import java.util.*; //1. import for input data form keyboard
public class Example3 {
	public static void main(String[] args) {
		//2. create class Scanner for input data form keyboard
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		//3. display and input data
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		System.out.print("input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println(); //เว้น 1 บรรทัด
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+totalPrice +  "baht.");
		double vat = totalPrice +(totalPrice*7/100); //calculate vat in baht
		System.out.println("Add VAT 7% is "+frm.format(vat) + "baht.");
	}

}
