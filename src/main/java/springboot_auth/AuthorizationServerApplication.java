package springboot_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class AuthorizationServerApplication  {
    /**
     * REFERENCE
     * https://spring.io/guides/gs/securing-web/
     *
     * **/
    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServerApplication.class, args);
    }
}
