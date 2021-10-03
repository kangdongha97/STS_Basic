package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StsController {
	
	@RequestMapping("/")
	public String method01() {
		
		System.out.println("함수콜index");
		
		return "index";
	}
	
	@RequestMapping("/tiger")
	public String method02() {
		
		System.out.println("함수콜tiger");
		
		return "tiger";
	}
}
