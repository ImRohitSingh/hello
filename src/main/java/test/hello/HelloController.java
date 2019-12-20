package test.hello;

import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {

	@RequestMapping("/hello/{name}")
	public String sayHello(@PathVariable(value="name") String name) {
		return "Hello, <b>" + name + "</b>. Greeted at " + new Date();
	}

}
