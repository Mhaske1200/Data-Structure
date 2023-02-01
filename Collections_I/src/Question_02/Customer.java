package Question_02;

import java.io.Serializable;

public class Customer implements Serializable
{
	private String name;
	private String emailid;
	private String contactno;
	
	Customer()
	{
		name = "NA";
		emailid = "NA";
		contactno = "NA";
	}
	Customer(String name , String emailid , String contactno)
	{
		this.name = name;
		this.emailid = emailid;
		this.contactno = contactno;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailid=" + emailid + ", contactno=" + contactno + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
}
