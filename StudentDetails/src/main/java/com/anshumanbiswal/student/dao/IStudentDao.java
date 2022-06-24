package com.anshumanbiswal.student.dao;

import java.util.List;

import com.anshumanbiswal.student.entity.Student;


public interface IStudentDao {

	List<Student> getStudents();

	void saveStudent(Student theStudent);

	Student getStudent(long theId);

	void deleteStudent(long id);
	
}
