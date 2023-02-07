package com.hasan.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			int sessionNum = (Integer) session.getAttribute("count")+1;
			session.setAttribute("count", sessionNum);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			int sessionNum = (Integer) session.getAttribute("count")+1;
			session.setAttribute("count", sessionNum);
		}
		return "count.jsp";
	}
}
