package com.calculator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = { "/", "index", "home", "main" })
	public String index() {
		return "index";
	}
}