package com.example.mvc_model.service;

import com.example.mvc_model.model.Course;
import java.util.List;
import org.springframework.data.domain.Page;

public interface CourseService {
    List<Course> getAllCourses();
    void saveCourse(Course course);
    Course getCourseById(long id);
    void deleteCourseById(long id);
    Page<Course> findPaginated(int pageNum, int pageSize,
                               String sortField,
                               String sortDirection);
}