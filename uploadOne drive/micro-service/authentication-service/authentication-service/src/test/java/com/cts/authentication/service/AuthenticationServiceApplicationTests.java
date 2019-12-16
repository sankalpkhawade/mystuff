package com.cts.authentication.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import com.cts.authentication.service.model.User;
import com.cts.authentication.service.repositry.UserRepository;
import com.cts.authentication.service.service.UserService;

@SpringBootTest
public class AuthenticationServiceApplicationTests {

	@InjectMocks
	UserService userService;

	@Mock
	UserRepository userRepository;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testUserServiceName() {
		User user = new User();
		user.setName("Sankalp Khawade");
		user.setEmail("lonavala@pune.com");
		user.setPassword("skk");
		user.setRole("child");
		userService.register(user);

		when(userRepository.findByName("Sankalp Khawade")).thenReturn(user);
		User testUser = userRepository.findByName("Sankalp Khawade");
		assertEquals("Sankalp Khawade", testUser.getName());
	}

	@Test
	public void testUserServiceNameFailure() {
		User user = new User();
		user.setName("Sankalp Khawade");
		user.setEmail("lonavala@pune.com");
		user.setPassword("skk");
		user.setRole("child");
		userService.register(user);

		when(userRepository.findByName("Sankalp Khawade")).thenReturn(user);
		User testUser = userRepository.findByName("Sankalp Khawade");
		assertEquals("SankalpKhawade", testUser.getName());
	}

	@Test
	public void testUserServiceEmail() {
		User user = new User();
		user.setName("Sankalp Khawade");
		user.setEmail("lonavala@pune.com");
		user.setPassword("skk");
		user.setRole("child");
		userService.register(user);

		when(userRepository.findByEmail("lonavala@pune.com")).thenReturn(user);
		User testUser = userRepository.findByEmail("lonavala@pune.com");
		assertEquals("lonavala@pune.com", testUser.getEmail());
	}

	@Test
	public void testUserServiceEmailFailure() {
		User user = new User();
		user.setName("Sankalp Khawade");
		user.setEmail("lonavala@pune.com");
		user.setPassword("skk");
		user.setRole("child");
		userService.register(user);

		when(userRepository.findByEmail("lonavala@pune.com")).thenReturn(user);
		User testUser = userRepository.findByEmail("lonavala@pune.com");
		assertEquals("lonaval@pune.com", testUser.getEmail());
	}
}
