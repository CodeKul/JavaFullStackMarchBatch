package com.example.JavaFullStackMarchBatch;

import com.example.JavaFullStackMarchBatch.di.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaFullStackMarchBatchApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JavaFullStackMarchBatchApplication.class, args);

		Company company = context.getBean(Company.class);
		company.showEmpInfo();

		Company company1 = context.getBean(Company.class);
		company1.showEmpInfo();
	}

}
