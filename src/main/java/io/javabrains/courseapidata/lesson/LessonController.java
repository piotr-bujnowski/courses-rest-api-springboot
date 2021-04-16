package io.javabrains.courseapidata.lesson;

import io.javabrains.courseapidata.course.Course;
import io.javabrains.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @RequestMapping("/topic/{topicId}/course/{courseId}/lessons")
    public List<Lesson> getAllLessons(@PathVariable String courseId) {
        return lessonService.getAllLessons(courseId);
    }

    @RequestMapping("/topic/{topicId}/course/{courseId}/lesson/{id}")
    public Lesson getLesson(@PathVariable String id) {
        return lessonService.getLesson(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic/{topicId}/course/{courseId}/lesson")
    public void addLesson(@RequestBody Lesson lesson, @PathVariable String topicId, @PathVariable String courseId) {
        lesson.setCourse(new Course(courseId, "", "", topicId));
        lessonService.addLesson(lesson);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{topicId}/course/{courseId}/lesson/{id}")
    public void updateLesson(@RequestBody Lesson lesson, @PathVariable String topicId, @PathVariable String courseId) {
        lesson.setCourse(new Course(courseId, "", "", topicId));
        lessonService.updateLesson(lesson);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{topicId}/course/{courseId}/lesson/{id}")
    public void deleteLesson(@PathVariable String id) {
        lessonService.deleteLesson(id);
    }
}
