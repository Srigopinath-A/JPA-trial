package Controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	
	@RequestMapping("/Login")
	public String login() {
		return "This is our login page";
	}
}
