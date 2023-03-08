package com.jsp.crud.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.crud.Service.StudentService;
import com.jsp.crud.entity.Student;
import com.jsp.crud.exception.ResourceNotFoundException;
import com.jsp.crud.repo.StudentRepo;

import jakarta.servlet.http.HttpSession;
@Service
public class StudentServiceImpl implements StudentService 
{
	@Autowired
	StudentRepo std;
	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return std.save(s);
	}
	
	
	@Override
	public boolean delete(Integer id) {
	    Optional<Optional<Student>> optionalT = Optional.ofNullable(std.findById(id));
	    if (optionalT.isPresent()) {
	        // id exists, delete it
	        std.deleteById(id);
	        return true;
	    } else {
	        // id does not exist, do not delete it
	        return false;
	    }
	}



	@Override
	public Student getVyId(Integer id)
	{
		Student st=std.findById(id).orElse(null);
		return st;
	}


	@Override
	public List<Student> gettAll() 
	{
		return std.findAll();
	}


	
	 Student exStudent;
	@Override
	public boolean updateStudent(Integer id) {
	    Optional<Student> optionalStudent = std.findById(id);
	    if (optionalStudent.isPresent()) {
	        // Student with the given id exists in the database
	        Student exStudent = optionalStudent.get();
	        System.out.println("here are details"+exStudent);
	        // Perform the update operation on exStudent here
	        // ...
	        // If the update operation is successful, return true
	        return true;
	    } 
	    else 
	    {
	        // Student with the given id does not exist in the database\
	    	System.out.println("not found");
	        throw new ResourceNotFoundException();
	    }
	}


	@Override
	public Student updateStudentLast(Student s) 
	{
		if(exStudent!=null)
		{
			exStudent.setId(s.getId());
			exStudent.setName(s.getName());
			exStudent.setPercentage(s.getPercentage());
			exStudent.setPhno(s.getPhno());
		}
		return std.save(s);
		
		// TODO Auto-generated method stub
		
		
	}


	@Override
	public void delAll()
	{
		 std.deleteAll();
	}

}

	
	
	
//	@Override
//	public boolean updateStudent(Integer id) {
//		
//		Student exStudent=std.findById(id).orElseThrow(()->new ResourceNotFoundException("Id"+id+"not found please enter valid id"));
//		if(exStudent!=null)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
////			exStudent.setId(s.getId());
////			exStudent.setName(s.getName());
////			exStudent.setPercentage(s.getPercentage());
////			exStudent.setPhno(s.getPhno());
////			return std.save(exStudent);
//		
//		
//		
//		
//		/*The statement Student exStudent=std.findById(s.getId()).orElse(null); 
//		 * will return either an instance of the Student class with the specified ID or null if no such instance exists in the database.
//		The findById() method is used to retrieve an entity from the database by its primary key. If the entity is found, 
//		it will be returned as an Optional object. The orElse() method is then called on the Optional object, which will return either the entity if it is present, 
//		or the specified default value (null in this case) if it is not present.
//		So if the specified ID matches an existing student in the database, the exStudent variable
// 		will be assigned a reference to that student object. Otherwise, it will be assigned null.
//*/
//	}
//
//}
