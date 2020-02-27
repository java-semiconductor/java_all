package sk.itlearning.springrs_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RestHandler {

	@GetMapping("/firmy")
	public Firma getFirmy() {
		Firma f = new Firma();
		f.setName("ONSEMI");
		return f;
	}

}
