package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
	@RequestMapping("/Hyello")
	public String hello() {
		return "helloWorld";
	}
}
