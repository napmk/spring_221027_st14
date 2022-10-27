package com.napmkmk.ex14;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping(value = "login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value = "loginOk")
	public String loginOk(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if((id.equals("tiger")) && (pw.equals("12345"))) {
			return "redirect:idOk";  // 요청을 써야함..
			
		}else {
			return "redirect:idNg"; 
		}
		
	
	}
	
	@RequestMapping(value = "idOk")
	public  String idOk() {
		return "check/idOk";
	}
	
	@RequestMapping(value = "idNg")
	public String idNg() {
		return "check/idNg";
	}
	
	@RequestMapping(value =  "test")
	public String test() {
		return "redirect:http://localhost:8080/ex14/test.jsp"; // 기존 다른사이트로 연결 할때도 사용
	}
	
}
