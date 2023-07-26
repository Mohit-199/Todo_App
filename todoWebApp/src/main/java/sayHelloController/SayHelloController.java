package sayHelloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {
		
	
	@RequestMapping("sayHelloJsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
