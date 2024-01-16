
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author(String name,String email) {
		this.name = name;
		this.email = email;
	}
	public Author() {
		this.name=null;
		this.email=null;
		this.gender=' ';
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
	    	if(gender == 'M' || gender == 'm') {
	    		return "Male";
	    	}
	    	else if (gender == 'F' || gender == 'f') 
	    		return "Female";
	    		else
	    			return null;
	    }
	public String toString() {
		return "Author name : " +name+" ("+email+";"+getGenderName()+")";
	}
}

