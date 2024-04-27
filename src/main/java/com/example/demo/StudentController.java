package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	SpringRepository sp;
	
	public StudentController(SpringRepository sp)
	{
		this.sp=sp;
	}
	
	@GetMapping("/insert")
	public String Storestudent()
	{
		Studentkodnest kd=new Studentkodnest("nick",95,"Nice");
		sp.save(kd);
		return "Student stored in database";
		
	}

}
