package com.shopping.ecommerce;

import com.shopping.ecommerce.users.models.ERole;
import com.shopping.ecommerce.users.models.Roles;
import com.shopping.ecommerce.users.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceApplication {

	@Autowired
	UserRoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

}
