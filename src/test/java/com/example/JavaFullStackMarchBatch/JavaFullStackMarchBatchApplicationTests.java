package com.example.JavaFullStackMarchBatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootTest
class JavaFullStackMarchBatchApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void helloWorld(){
		RestTemplate restTemplate = new RestTemplate();

		String baseUrl = "http://localhost:9800/helloWorld";
		URI uri = null;
		try {
			 uri = new URI(baseUrl);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		ResponseEntity<String> result = restTemplate.getForEntity(uri,String.class);

		Assertions.assertEquals(200,result.getStatusCodeValue());
		Assertions.assertEquals(true,result.getBody().contains("Hii Spring"));
	}

}
