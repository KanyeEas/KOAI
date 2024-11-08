package io.wille_ost.koai_backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class KoaiBackendApplicationTests {

	@Test
	void contextLoads() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = "admin";
		String encodedPassword = encoder.encode(password);
		System.out.println(encodedPassword);
		System.out.println(encoder.matches(password, encodedPassword));
	}

}
