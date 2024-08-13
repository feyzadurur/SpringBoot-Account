package com.example.account;

import com.example.account.model.Account;
import kotlin.collections.SetsKt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Account a=new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, SetsKt.emptySet());
		Account b=new Account("a", BigDecimal.ONE, LocalDateTime.now(),null, SetsKt.emptySet());

		/*Set<Account> aa =Set.of(a,b);

		Map<Account,String> accountMap=new HashMap<>();

		accountMap.keySet(); //Set
		accountMap.values(); //Collection*/
	}
}
