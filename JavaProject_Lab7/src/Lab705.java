import javax.swing.*;
public class Lab705 {

	public static void main(String[] args) {
		int[] num = new int[5];
		for(int i=0; i<num.length; i++) {
		num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number" + (i+1)+":"));
		
		}
		showEven(num);
		showOdd(num);

	}
	public static void ShowEven(int[]nums) {
        for(int _nums:nums) {
        	if(_nums %2==0) {
        		even+= _nums+" ";
        		
        	}
        }	
     JOptionPane.showMessageDialog(null, "List of even number : \n"+ even);
	}
	public static void Showodd (int[]nums) {
        for(int _nums:nums) {
        	if(_nums %2==1) {
        		odd+= _nums+" ";
	}
  }
     JOptionPane.showMessageDialog(null, "List of even number : \n"+ odd);
    }
}
