package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;

@Controller
public class HomeController {

		
		@RequestMapping("/test2")
		String fun1(Model m)
		{
			Student s=new Student(101,"Ram","Nagpur");
			m.addAttribute("obj",s);
			
			return "page1.html";
		}
//

	
          @RequestMapping("/")
          @ResponseBody
         String Myfun()
         {
        	 return "Hello";
         }
	
	
}
