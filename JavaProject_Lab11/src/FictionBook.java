import java.time.Year;
public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	public FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		this.author_name=name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		int space = this.author_name.trim().indexOf(" ");
		if(space==-1) return false;
		else return true;
	}
	public String getTitle() {
			return this.title;
	}
	
	@Override

	public String getLastName() {
		int space = this.author_name.trim().indexOf(" ");
		return this.author_name.substring(space+1).toUpperCase();
	}
	public String getFirstName() {
		int space = this.author_name.trim().indexOf(" ");
		return this.author_name.substring(0,space).toUpperCase();
	}
	public boolean checkEmail() {
		this.email = this.email.toLowerCase();
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
			return true;
		}else {
			return false;
		}
	}

	public int totalPublicYear() {
		int year = Year.now().getValue();
		return year-this.publicYear;
	}
	public String toString() {
		return this.title+" write by "+getLastName().substring(0,1)+"."+getFirstName()+"("+this.email+")"+"\nPublished for "+totalPublicYear()+" years.";
	}
}