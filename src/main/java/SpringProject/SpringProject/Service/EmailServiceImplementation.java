package SpringProject.SpringProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import SpringProject.SpringProject.Model.EmailDetails;
import SpringProject.SpringProject.Repository.EmailRepository;
@Service
public class EmailServiceImplementation implements EmailRepository{
	
@Autowired private JavaMailSender javaMailSender;

@Value("${spring.mail.username}")

private String sender;

public String sendSimpleMail(EmailDetails details) {
	try {
		SimpleMailMessage mailmessaging=new  SimpleMailMessage();
		mailmessaging.setFrom(sender);
		mailmessaging.setTo(details.getRecipent());
		mailmessaging.setSubject(details.getSubject());
		mailmessaging.setText(details.getMsgBody());
		javaMailSender.send(mailmessaging);
		return "Mail Sent Succesfully";
	}
	catch (Exception ex) {
		return ex.getMessage();
	}
	
	
}
}
