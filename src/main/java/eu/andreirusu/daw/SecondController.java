package eu.andreirusu.daw;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class SecondController {

		@GetMapping("/hello-world")
		public String sayYourName() {
			return "Ma numesc Ioana!";
		}
	}
