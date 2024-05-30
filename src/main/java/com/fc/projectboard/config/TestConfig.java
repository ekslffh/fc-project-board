package com.fc.projectboard.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fc.projectboard.util.FormDataEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test") // 테스트 환경에서 @ActiveProfiles("test") 를 이용하여 여기에 설정된 빈들을 활성화 한다.
public class TestConfig {

    @Bean
    public FormDataEncoder formDataEncoder() {
        return new FormDataEncoder(new ObjectMapper());
    }

}
