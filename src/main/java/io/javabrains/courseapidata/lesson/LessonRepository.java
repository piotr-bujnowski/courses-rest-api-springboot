package io.javabrains.courseapidata.lesson;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LessonRepository extends CrudRepository<Lesson,String> {

    public List<Lesson> findByCourseId(String id);
}
