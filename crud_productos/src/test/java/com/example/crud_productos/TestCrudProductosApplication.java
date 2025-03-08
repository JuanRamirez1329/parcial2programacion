package com.example.crud_productos;

import org.springframework.boot.SpringApplication;

public class TestCrudProductosApplication {

	public static void main(String[] args) {
		SpringApplication.from(CrudProductosApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
