package org.milan.sbrest.controller;

import java.util.List;

import org.milan.sbrest.model.StudentVO;
import org.milan.sbrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// Create the Student Details
	@PostMapping("create")
	public StudentVO createStudent(@RequestBody StudentVO studentVO) {
		System.out.println(studentVO.getId());
		StudentVO studentVO2 = studentService.createStudent(studentVO);
		return studentVO2;
	}

	// Fetching all the Student Details
	@GetMapping("getall")
	public List<StudentVO> getAllStudent() {
		System.out.println("Calling");
		List<StudentVO> studentVO = studentService.getAll();
		return studentVO;
	}

	// Delete Student
	@DeleteMapping("delete/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.deleteDetails(id);
	}

}
