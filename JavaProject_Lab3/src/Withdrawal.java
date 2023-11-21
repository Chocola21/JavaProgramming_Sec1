import javax.swing.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int withdrawMoney = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : "+ frm.format(balance)
				+ "\nInput money to withdraw : "));
		//if/else if for check condition
		
		if(withdrawMoney>balance) {
			JOptionPane.showMessageDialog(null, "ERROR : Cannot withdraw more than balance "
					, "ERROR",JOptionPane.ERROR_MESSAGE);
			
		else if(withdrawMoney>20000) {
			JOptionPane.showMessageDialog(null, "ERROR : Cannot withdraw more than 20,000" ,
					"ERROR", JOptionPane.ERROR_MESSAGE);
			
		else if(withdrawMoney%100!=0) {
			int mod = withMoney%100;
		}
				JOptionPane.showMessageDialog(null, "ERROR : Cannot withdraw more than 20,000" ,
					"EROOR", JOptionPane.ERROR_MESSAGE);
				
		int Money1000 = withdrawMoney/1000;
		int Money500 = withdrawMoney - (Money1000 * 1000) /500 ;
		int Money100 = withdrawMoney - (Money1000 * 1000) - (Money500 * 500) / 100;
		JOptionPane.showMessageDialog(null,
				"You withdraw"+ withdrawMoney + " baht."+ "\nMoney1,000 =" +Money1000+"\n500="+Money500+"\n100="+Money100);
				
			}
		}
			

	}

}
