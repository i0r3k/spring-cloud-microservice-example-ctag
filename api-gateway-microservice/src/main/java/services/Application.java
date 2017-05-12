package services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import services.accessfilter.AccessFilter;

@SpringBootApplication
@EnableSidecar
@EnableRedisHttpSession
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
