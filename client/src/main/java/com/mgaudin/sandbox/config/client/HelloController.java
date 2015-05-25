package com.mgaudin.sandbox.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RefreshScope
@RestController
public class HelloController {
    private final String welcomeString;

    @Inject
    public HelloController(
            @Value("${welcome.string}") String welcomeString
    ) {
        this.welcomeString = welcomeString;
    }


    @RequestMapping("/")
    public String hello() {
        return welcomeString;
    }
}
