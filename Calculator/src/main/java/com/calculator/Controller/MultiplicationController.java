package com.calculator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplicationController {

	@GetMapping("/multiplication")
	public String multiplication() {
		return "multiplication";
	}

	@PostMapping("/multiplication")
	public String additionPost(@RequestParam double val1, double val2, Model model) {
		double sum = val1 * val2;
		model.addAttribute("sum", sum);
		return "multiplication";
	}
}