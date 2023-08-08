package SpringProject.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringProject.SpringProject.Model.Topic;
import SpringProject.SpringProject.Service.TopicContentService;

@RestController
public class TopicContentController {

	@Autowired TopicContentService tcservicerepo;
	@PostMapping("add/topic_content")
	public void AddTopicContent(@RequestBody Topic t) {
		tcservicerepo.AddTopicContent(t);
	}
}
