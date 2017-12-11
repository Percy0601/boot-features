package io.training.boot.features.groovy

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TrainingController {

    @GetMapping("/greeting")
    String greeting() {
        return "Hello World~"
    }
}
