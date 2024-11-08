package io.wille_ost.koai_backend;

import io.wille_ost.koai_backend.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.wille_ost.koai_backend.mapper")
public class KoaiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(KoaiBackendApplication.class, args);
	}

}
