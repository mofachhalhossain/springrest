package com.springrest.springrest.service;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourse();

    public Course getCourse(long courseId);

    Course addCourse(Course course);
    
    Course updateCourse(Course course);

    void deleteCourse(long parseLong);
}
