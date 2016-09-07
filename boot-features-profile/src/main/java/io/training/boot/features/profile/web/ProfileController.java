package io.training.boot.features.profile.web;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Profile("dev")
@RestController
public class ProfileController {

	@GetMapping("/profile")
	public String profile() {
		log.info("该请求只有在dev环境才可以运行");
		return "This dev profile";
	}
	
}
