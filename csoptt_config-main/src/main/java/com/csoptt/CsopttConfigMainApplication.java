package com.csoptt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 启动类
 * 配置中心服务端
 * 可被注册中心发现
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class CsopttConfigMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsopttConfigMainApplication.class, args);
	}
}
