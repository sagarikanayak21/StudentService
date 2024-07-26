package com.sn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sn.service.StudentService;
import com.sn.vo.Student;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/{sid}/details")
	public Student getStudentById(@PathVariable int sid) {
		return studentService.getStudentDetails(sid);
	}
}
