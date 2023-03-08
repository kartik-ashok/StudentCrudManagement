package com.jsp.crud.Service;


import org.springframework.stereotype.Service;

import com.jsp.crud.entity.Student;
import java.util.List;

import jakarta.persistence.criteria.CriteriaBuilder.In;
import jakarta.servlet.http.HttpSession;

public interface StudentService
{
	Student save(Student s);
	boolean delete(Integer id);
	Student getVyId(Integer id);
	List<Student> gettAll();
	boolean updateStudent(Integer id);
	Student updateStudentLast(Student s);
	public void delAll();
	
}
