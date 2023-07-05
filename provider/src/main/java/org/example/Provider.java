package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("org.example.dao.mapper")
public class Provider
{
    public static void main( String[] args )
    {
        SpringApplication.run(Provider.class, args);
    }
}
