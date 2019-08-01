package me.dong.thymeleafstudy;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

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
//		model.addAttribute("accounts", generateAccounts());
		model.addAttribute("sw", 1);
		return "index";
	}
	
	private Set<Account> generateAccounts() {
		
		Set<Account> accounts = new HashSet<>();
		
		IntStream.range(0, 30).forEach(i -> {
			accounts.add(Account.builder().id(i).name("dong" + i).tel("010-0000-0000").build());
		});
		
		return accounts;
	}
	
}
