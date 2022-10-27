package com.napmkmk.ex14;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IdController {
	@RequestMapping(value = "/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value =  "/student", method = RequestMethod.POST) 
	//method = RequestMethod.GET  잘 나오나 봐야함 view form을 잘봐야 함. ->method 
    //405 에러 Request method 'POST' not supported
	public String student(HttpServletRequest request, Model model ) {
		
		String id = request.getParameter("id");
		
		model.addAttribute("studentId" ,id);
		
		
		return "studentIdView";
	}
}
