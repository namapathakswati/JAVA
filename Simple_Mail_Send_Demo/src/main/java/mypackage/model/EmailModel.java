package mypackage.model;

public class EmailModel {

	
	public String email_address;
	public String subject;
	public String message;
	
	public EmailModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailModel(String email_address, String subject, String message) {
		super();
		this.email_address = email_address;
		this.subject = subject;
		this.message = message;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
