package com.example.devopsblog;

import com.example.devopsblog.controller.RestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsblogApplicationTests {


	@MockBean
	RestController restController;

	@Test
	public void getHelloPlayerNameTest() {
		when(restController.getHelloPlayerName("John")).thenReturn("Hello player John");
	}

	@Test
	public void happyBirthdayUserTest() {
		when(restController.happyBirthdayUser("John")).thenReturn("Happy birthday to you, John");
	}

}
