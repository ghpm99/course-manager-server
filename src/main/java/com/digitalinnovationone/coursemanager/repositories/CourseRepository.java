package com.digitalinnovationone.coursemanager.repositories;

import com.digitalinnovationone.coursemanager.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
