package kr.ac.hansung.cse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/api/v1")
public class HomeController {

	// 로거 생성
	static Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// @GetMapping is a composed annotation that acts as a shortcut for
	// @RequestMapping(value="/", method = RequestMethod.GET).
	@GetMapping("/")
	public String home(Model model) {

		logger.info("Info: Calling home( )" );
		logger.debug("Debug: Calling home( )" );
		logger.trace("trace: Calling home( )" );
		
		// 모델에 hello world 메시지를 넣음 
		model.addAttribute("message", "hello world");
		
		// index는 뷰를 담당 
		return "index";

	}	
	
}