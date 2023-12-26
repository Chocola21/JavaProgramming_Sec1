import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		//1.input email form dialog box
		String inputEmail = JOptionPane.showInputDialog("Input your email").toLowerCase();
		
		//2.check email start with @ or space bar or not
		while(inputEmail.startsWith("@")||inputEmail.startsWith(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail,again : ");
		}
		//3.ส่งตัวแปร inputEmailไปยังเมธอด checkEmail และ return ค่ากลับ
		boolean validateEmail = checkEmail(inputEmail);
		if(validateEmail==true) {
			JOptionPane.showMessageDialog(null,"Your e-mail is " + inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null," Your e-mail is not hotmail or gmail dot com");
		}
	}
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		
		else return false;
	}
 }
