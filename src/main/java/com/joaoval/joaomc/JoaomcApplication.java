package com.joaoval.joaomc;

import com.joaoval.joaomc.domain.Category;
import com.joaoval.joaomc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class JoaomcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(JoaomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Informatics");
		Category cat2 = new Category(null, "Office");

		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
	}
}
