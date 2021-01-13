package com.github.hannotify.maventestphases;

import com.github.hannotify.maventestphases.annotations.EndToEndTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EndToEndTest
class EndToEndTests {

	@Test
	void test() {
		System.out.println("This is an end-to-end test using REST Assured.");
	}

}
