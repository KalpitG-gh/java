package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GreetingTest {

    @Test
    void testGreetingModel() {
        // Create a new instance of Greeting with the message "Hello, World!"
        Greeting greeting = new Greeting("Hello, World!");
        
        // Assert that the message in the Greeting object is correctly set
        assertThat(greeting.getMessage()).isEqualTo("Hello, World!");
    }
}
