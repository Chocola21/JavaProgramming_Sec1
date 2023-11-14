import javax.swing.*; //1. import library for input data form dialog Box
import java.text.*;
public class Example4 {
	public static void main(String[] args) {
		//2. input data form dialog box
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog ("Input Product Name : ");
		
	/*	//input unit price form dialog box
		String strUnit = JOptionPane.showInputDialog("Input Product unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit); */
		
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product unit : ")); 
		
		
		
		//input price per unit form dialog box
		String strPrice = JOptionPane.showInputDialog("Input Price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		
		//calculate total price
		float totalPrice = productUnit * pricePerUnit;
		double vat = totalPrice +(totalPrice*7/100);
		//display data to dialog box
		JOptionPane.showConfirmDialog(null, "Total Price is  "
				+frm.format(totalPrice) + " baht." + "\nAdd VAT 7% is " + frm.format(vat) + " baht." );
		
		
	}

}
