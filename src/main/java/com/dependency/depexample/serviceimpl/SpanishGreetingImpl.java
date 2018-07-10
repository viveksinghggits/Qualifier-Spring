package com.dependency.depexample.serviceimpl;

import com.dependency.depexample.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/***
 * so if we use default also, with the Profile annotation we tell the framework
 * that this profile should be default and this implementation should be injects
 * if there is a need.
 * This will only work if we dont have any profiles active on .properties file
 */
@Component
@Primary
@Profile({"es", "default"})
public class SpanishGreetingImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hola como estás";
    }
}
