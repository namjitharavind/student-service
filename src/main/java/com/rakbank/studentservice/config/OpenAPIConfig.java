package com.rakbank.studentservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Student Service",
                description = "Student Service will provide all API's required for student user management",
                version="1.0",
                license = @License(
                        name = "Apache 2.0",
                        url="http://springdoc.org"
                ),
                termsOfService = "http://swagger.io/terms/"
        ),
        servers = {
                @Server(
                        description = "Local",
                        url="http://localhost:9080"
                )
        }
)
@Configuration
public class OpenAPIConfig {

}
