package com.dora;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * Hello world!
 *
 */

@EnableOpenApi
@MapperScan("com.dora.server.mapper")
@SpringBootApplication
public class DoraServerApplication
{
    public static void main(String[] args) {
        SpringApplication.run(DoraServerApplication.class, args);
    }

}
