package com.sn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sn.vo.Student;
import com.sn.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceI{
	@Autowired
	StudentRepository studentRepository;
	@Override
	public Student getStudentDetails(int sid) {
		 Optional<Student>std = studentRepository.findById(sid);
		 if(std.isPresent()) {
			 return std.get();
		 }
		 return null;
	}
	
}
