package TestTry.TestTry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

class TestTryApplicationTests {

	@Autowired
	private TestService testService;

	@Test
	 void testGetMessage() {
		String expectedMessage = "Hello,world!";
		String actualMessage = testService.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}
}
