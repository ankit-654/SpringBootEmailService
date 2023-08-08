package SpringProject.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringProject.SpringProject.Model.EmailDetails;
import SpringProject.SpringProject.Service.EmailServiceImplementation;

@RestController
public class EmailController {
@Autowired EmailServiceImplementation email;

@PostMapping("api/mail/sending")
public String SendMail(@RequestBody EmailDetails e) {
	EmailDetails ed=new EmailDetails(e.getRecipent(), e.getSubject(), e.getMsgBody());
	email.sendSimpleMail(ed);
	System.out.println(e.getRecipent()+" "+e.getSubject()+" "+e.getMsgBody());
	return "Mail Sent";
	}
}
