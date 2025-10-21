package com.senai.infob.aula.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "NaTrave",
        version = "1.0",
        description = "API para um aplicativo de futebol"
    )
)
public class Swagger {

}