package com.anshumanbiswal.student.service;

import java.util.List;

import com.anshumanbiswal.student.entity.Student;

public interface IStudentService {

	List<Student> getAllStudents();

	void saveStudent(Student theStudent);

	Student getStudent(long theId);

	void deleteStudent(long theId);
}
