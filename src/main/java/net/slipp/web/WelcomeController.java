package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	//머스텟시 템플릿은 url 로 호출할 수 없고, 오로지 컨트롤러를 거쳐야만한다.
	
	@GetMapping("/helloworld")
	public String welcome(String name, int age, Model model) {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "welcome";	// 접근할 파일이름, static 이 아닌 templates 하위에 있는 파일을 호출한다.
	}
	
}
