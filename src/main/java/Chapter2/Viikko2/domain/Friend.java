package Chapter2.Viikko2.domain;

public class Friend {
	
	private String fname;
	private String lname;
	
	public Friend() {
		super();
	}

	public Friend(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	 
	
	

}
