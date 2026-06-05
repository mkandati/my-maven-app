package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    
    @Test
    public void testHomeEndpoint() {
        App app = new App();
        String result = app.home();
        assertTrue(result.contains("Welcome to my AWS EC2 Cloud Server!"));
    }
}