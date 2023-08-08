package SpringProject.SpringProject.Model;

public class EmailDetails {
private String recipent;
private String subject;
private String msgBody;
public EmailDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public EmailDetails(String recipent, String subject, String msgBody) {
	super();
	this.recipent = recipent;
	this.subject = subject;
	this.msgBody = msgBody;
}
public String getRecipent() {
	return recipent;
}
public void setRecipent(String recipent) {
	this.recipent = recipent;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMsgBody() {
	return msgBody;
}
public void setMsgBody(String msgBody) {
	this.msgBody = msgBody;
}

}
