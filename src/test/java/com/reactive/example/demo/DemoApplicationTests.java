package com.reactive.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class DemoApplicationTests {

	@Autowired
	WebTestClient webTestClient;

	@Test
	void testHelloEndPoint() {

		String responseString = new String("Hello, Spring!");

		webTestClient.get()
				.uri("/hello")
				.accept(MediaType.APPLICATION_JSON)
				.exchange()
				.expectStatus().isOk()
				.expectBody(String.class)
				.consumeWith(serverResponseFluxExchangeResult -> {
					assertEquals(responseString,serverResponseFluxExchangeResult.getResponseBody());
				});
	}



}
