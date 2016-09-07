package io.training.boot.features.reload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class CustomController {

	@RequestMapping("/print")
	public String print(String name) {
		log.info("测试热加载======{}", name);
		return "Helo: " + name;
	}
}
