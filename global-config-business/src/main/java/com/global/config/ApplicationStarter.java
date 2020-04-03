package com.global.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: 鲁砚琨
 * @CreateTime: 2020-04-02 下午 03:23
 * @Version: v1.0
 */
@Slf4j
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ApplicationStarter extends SpringBootServletInitializer {

    /**
     *
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationStarter.class);
    }


    public static void main(String[] args) {
        log.info("启动服务......");
        SpringApplication.run(ApplicationStarter.class);
        log.info("启动完成......");
    }
}
