package com.dependency.depexample.serviceimpl;

import com.dependency.depexample.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("en")
public class EngGreetingImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hi There";
    }
}
