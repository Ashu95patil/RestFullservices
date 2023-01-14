package com.CodewithAshu.RestfullCrudOperation1.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Component
public class SwaggerConfig {

	
	@Bean
	public Docket apiDoc() {
		
		return new Docket(DocumentationType.SWAGGER_2)
			
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.CodewithAshu.RestfullCrudOperation1.Controller"))
				.paths(PathSelectors.any())
				.build();
	}
}
/*
 * <plugin> <groupId>org.sonarsource.scanner.maven</groupId>
 * <artifactId>sonar-maven-plugin</artifactId> <version>3.4.0.905</version>
 * </plugin>
 */