package TestTry.TestTry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

class TestTryApplicationTests {

	@Autowired
	private TestService testService;

	@Test
	public void testGetMessage() {
		String expectedMessage = "Hello, Spring Boot!";
		String actualMessage = testService.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}
}
