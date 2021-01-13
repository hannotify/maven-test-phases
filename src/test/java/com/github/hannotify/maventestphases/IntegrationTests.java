package com.github.hannotify.maventestphases;

import com.github.hannotify.maventestphases.annotations.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@IntegrationTest
class IntegrationTests {

	@Test
	void test() {
		System.out.println("This is an integration test using JUnit.");
	}

}
