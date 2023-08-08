package SpringProject.SpringProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import SpringProject.SpringProject.Model.Content;
import SpringProject.SpringProject.Model.Topic;
import SpringProject.SpringProject.Repository.ContentRepository;
import SpringProject.SpringProject.Repository.TopicRepository;

@Service
public class TopicContentService {
	@Autowired TopicRepository topicrepo;
	@Autowired ContentRepository contentrepo;
	
	public void AddTopicContent(@RequestBody Topic t) {
		Topic to=new Topic(0, t.getTopic_name(), null);
		Topic tp=topicrepo.save(to);
		for(Content c:t.getContents()) {
			Content co=new Content(0, c.getContent_name(), tp);
			contentrepo.save(co);
		}
	}

}
