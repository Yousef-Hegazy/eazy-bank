package com.eazy_bank.eazy_bank;

import com.eazy_bank.eazy_bank.models.Customer;
import com.eazy_bank.eazy_bank.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class EazyBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyBankApplication.class, args);
	}


	@Bean
	public CommandLineRunner initDb(CustomerRepository cr, PasswordEncoder passwordEncoder) {
		return (args) -> {
			if (cr.count() == 0) {
				cr.save(
						Customer.builder()
								.email("test@test.com")
								.name("test")
								.password(passwordEncoder.encode("ASD@asd@123$"))
								.build()
				);
			}
		};
	}
}
