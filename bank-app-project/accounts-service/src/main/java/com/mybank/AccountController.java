package com.mybank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	@GetMapping("/{accountNumber}")
	public AccountReponseDto accounts(@PathVariable("accountNumber") long accountNo) {
		
		Account account = accountRepository.findByAccountNumber(accountNo).get();
		
		AccountReponseDto accountResponseDto = new AccountReponseDto();
		accountResponseDto.setAccount(account);
		
		return accountResponseDto;
	}
	
}
