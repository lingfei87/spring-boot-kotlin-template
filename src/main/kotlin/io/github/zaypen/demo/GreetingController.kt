package io.github.zaypen.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {
    @RequestMapping("/greet")
    fun greet() = "Hello Kotlin"
}
