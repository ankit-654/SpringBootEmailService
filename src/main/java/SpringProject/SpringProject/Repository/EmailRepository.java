package SpringProject.SpringProject.Repository;


import SpringProject.SpringProject.Model.EmailDetails;

public interface EmailRepository {
	
     String sendSimpleMail(EmailDetails details);

}
