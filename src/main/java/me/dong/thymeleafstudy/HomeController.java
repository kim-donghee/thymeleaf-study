package me.dong.thymeleafstudy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import me.dong.thymeleafstudy.account.Account;

@Controller
public class HomeController {
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("message", "Hello Dong");
		model.addAttribute("account", Account.builder().name("dong").tel("010-0000-0000").build());
		model.addAttribute("checked", true);
		return "index";
	}
	
}
