package org.milan.sbrest.service;

import java.util.List;

import org.milan.sbrest.dao.StudentDAO;
import org.milan.sbrest.model.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StudentDAO studentDAO;

	public StudentVO createStudent(StudentVO studentVO) {
		// TODO Auto-generated method stub
		return studentDAO.save(studentVO);
	}

	public List<StudentVO> getAll() {
		// TODO Auto-generated method stub
		return (List<StudentVO>) studentDAO.findAll();
	}

	public void deleteDetails(int id) {
		// TODO Auto-generated method stub
		studentDAO.deleteById(id);
	}

}
