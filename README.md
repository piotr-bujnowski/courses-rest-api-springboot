# Courses REST API springboot
This a very basic REST API using spring boot.  
Databases are stored on Apache Derby.
  
### GET requests:
``/topics`` - all topics  
``/topic/{id}``  
  
``/topic/{topicId}/courses`` - all courses  
``/topic/{topicId}/course/{id}``  
  
``/topic/{topicId}/course/{courseId}/lessons`` - all lessons    
``/topic/{topicId}/course/{courseId}/lesson/{id}``  

### POST requests:
``/topic``  
```
{  
    "id": "topicId",  
    "name": "Topic",  
    "description": "This is a topic"  
}  
```
  
``/topic/{topicId}/course``  
```
{  
    "id": "courseId",  
    "name": "Course",  
    "description": "This is a course"  
}
```  
  
``/topic/{topicId}/course/{courseId}/lesson``
```
{
    "id": "lessonId",
    "name": "Lesson",
    "description": "This is a lesson"
}
```

### PUT requests:
``/topic/{id}``  
``/topic/{topicId}/course``  
``/topic/{topicId}/course/{courseId}/lesson/{id}``

### DELETE requests:
``/topic/{id}``  
``/topic/{topicId}/course/{id}``  
``/topic/{topicId}/course/{courseId}/lesson/{id}``
