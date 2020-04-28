import java.util.Date;

public class User {
	
	String name;
	String surname;
	String password;
	Date registered;
	
	
	public User(String name, String surname, String password, Date registered) {
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.registered = registered;	
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Date getRegistered() {
		return registered;
	}


	public void setRegistered(Date registered) {
		this.registered = registered;
	}
	

}
