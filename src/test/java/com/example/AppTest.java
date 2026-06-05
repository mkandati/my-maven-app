package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    
    @Test
    public void testHomeEndpoint() {
        App app = new App();
        String result = app.home();
        assert(result.contains("Welcome to my AWS EC2 Cloud Server!"));
    }
}