package com.fc.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {

    // Spring Data JPA 는 해당 빈을 이용하여 생성자 및 수정자의 정보를 채운다.
    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("uno"); // TODO: 스프링 시큐리티로 인증 기능을 붙이게 될때, 수정할 계획
    }

}
