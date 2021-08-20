package com.digitalinnovationone.coursemanager.dto.mapper;

import com.digitalinnovationone.coursemanager.dto.request.CourseDTO;
import com.digitalinnovationone.coursemanager.entities.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    Course toModel(CourseDTO courseDTO);

    CourseDTO toDTO(Course course);

}
