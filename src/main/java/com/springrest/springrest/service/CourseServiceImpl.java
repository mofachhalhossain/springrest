package com.springrest.springrest.service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

//    List<Course> list;
    Course newCourse = new Course();
    @Autowired
    private CourseDao courseDao;


    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(133, "SpringBoot", "SpringBoot Crash Course"));
//        list.add(new Course(343,"SpringMvc","SpringMvc Crash Course"));
    }

    @Override
    public List<Course> getCourse() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
//        Course c = null;
//        for(Course course:list){
//            if(course.getId() == courseId){
//                c = course;
//                break;
//            }
//        }
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {

//        list.forEach(forUpdateCourse->     //forUpdateCourse will store single course of the list and store them to work
//        {
//            if (forUpdateCourse.getId() == course.getId()){
//                forUpdateCourse.setTitle(course.getTitle());
//                forUpdateCourse.setDescription(course.getDescription());
//            }
//        });

        courseDao.save(course);

        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
//        list = this.list.stream().filter(error-> error.getId()!=parseLong).collect(Collectors.toList());

        Course entity =courseDao.getOne(parseLong);
        courseDao.delete(entity);
    }


}



