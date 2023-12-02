package mypackage;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApiController {

	@GetMapping("api/sample")
	public String FristApi() {
		return "Welcome to first api";
	}
	
	@GetMapping("api/square/{id}")
	public String SquareApi(@PathVariable("id")int b) {
		int c = b*b;
		return "Square ="+c;
	}
}
