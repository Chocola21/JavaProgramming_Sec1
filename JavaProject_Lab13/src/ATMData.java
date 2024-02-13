
public class ATMData {
	private String accountNumber;
	private String password;
	
	public ATMData(String account,String password) {
		
	}
	public String getID() {
		return this.accountNumber;
	}
	public String getPass() {
		return this.password;
	}
	public boolean checkBookBank() {
		return true;
	}
}
