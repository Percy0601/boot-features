package io.training.boot.features.error.web;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class StandardRestController {

	@RequestMapping("/hello")
	public String hello(String name) {
		log.info("标准的请求方法");
		return "Hello:" + name;
	}

	@RequestMapping("/rest-error")
	public String error(String name) {
		Random r = new Random();
		Integer result = r.nextInt(3);
		if (result > 1) {
			throw new RuntimeException("测试异常：" + name);
		}
		return "My Error: " + name;
	}
}
