package com.online.zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableZuulProxy
@EnableResourceServer
public class ZuulserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulserverApplication.class, args);
	}

}
