package io.javabrains.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("java", "java topic", "this is a java topic"),
            new Topic("python", "python topic", "this is a python topic")
    ));

    public List<Topic> getTopics() {
        for (Topic topic : topics) {
            topicRepository.save(topic);
        }

//        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
