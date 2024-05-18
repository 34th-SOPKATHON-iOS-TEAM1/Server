package com.example.sopkathon34.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Sopkathon ios team 1 Swagger")
                .description("NOW SOPT Sopkathon iOS team 1 Swagger API")
                .version("v1");

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}
