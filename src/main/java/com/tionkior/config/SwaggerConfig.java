package com.tionkior.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Swagger Config
 *
 * @author : TionKior
 * @date : 2022/1/16 20:37
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment) {
        // 获取当前的环境(低版本SpringBoot可能获取不到)
        boolean flag = environment.acceptsProfiles(Profiles.of("dev", "test"));
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("史晟贤")
                .apiInfo(apiInfo())
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.tionkior.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("史晟贤", "http://www.tionkior.com", "1423304936");
        return new ApiInfo(
                "BaseFrameworkAPI文档",
                "BaseFrameworkAPI文档,基于Swagger",
                "v1.0",
                "http://www.tionkior.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }

}