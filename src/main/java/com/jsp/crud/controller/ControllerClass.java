package com.jsp.crud.controller;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.crud.Service.StudentService;
import com.jsp.crud.entity.Student;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class ControllerClass 
{	
	@Autowired
	StudentService studentService;
	/*Here logic for button jsp*/
	@RequestMapping("/button")
	public String button()
	{
		return "button.jsp";
	}
	
	
	
	@RequestMapping("/saveing")
	public String dataAdd(Student s)
	{
		studentService.save(s);
		return "button.jsp";
	}
	
	
	
	@RequestMapping("/dlt")
	public String deleteStudent(Integer id)
	{
		boolean bb=studentService.delete(id);
		if(bb==true)
		{
			return "button.jsp";
		}
		else
		{
			return "button.jsp";
		}
	
	}
	
	
	
	@RequestMapping("/getting")
	public String gettingbyId(int id,HttpSession s)
	{
		Student std=studentService.getVyId(id);
		s.setAttribute("value",std);
		System.out.println(std);
		return "gettindetailById.jsp";
	}	
	
	
	
	@RequestMapping("/getalld")
	public String getAllDetails(HttpSession s)
	{
		List<Student> list=studentService.gettAll();
		s.setAttribute("all", list);
		System.out.println(list);
		return "getAll.jsp";
	}
	
	
	
	@RequestMapping("/update")
	public String updateData(Integer id)
	{
		System.out.println("=================");
		System.out.println(id);
		System.out.println("=================");
		boolean bob=studentService.updateStudent(id);
		System.out.println(bob);
//		if(bob==true)
//		{
//			studentService.updateStudentLast(null);
//		}
		return "UpdateLast.jsp";
	}
	
	@RequestMapping("/lastupdate")
	public String updateLastStep(Student s)
	{
		s.setId(s.getId());
		System.out.println(s);
		System.out.println("----------------");
		studentService.updateStudentLast(s);
		System.out.println("----------------");
		return "button.jsp";
	}
	@RequestMapping("/delall")
	public String deleteAllDetails()
	{
		studentService.delAll();
		return "button.jsp";
	}
	
}
