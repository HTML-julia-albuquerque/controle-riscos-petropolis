package com.senai.backend.riscos_petropolis.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Riscos em Petrópolis",
        version = "1.0",
        description = "Site para ocorrências em áreas de risco"
    )
)
public class Swagger {
}
