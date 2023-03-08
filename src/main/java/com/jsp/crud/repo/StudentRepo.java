package com.jsp.crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.crud.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{
	
}
