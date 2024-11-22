package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ControllerTest {

    @Test
    void testGreetingEndpoint() {
        // Create a new instance of the Controller
        Controller controller = new Controller();
        
        // Call the greet method with a parameter
        Greeting response = controller.greet("World");
        
        // Assert that the returned response is correct
        assertThat(response.getMessage()).isEqualTo("Hello, World!");
    }

    @Test
    void testGreetingWithCustomName() {
        // Create a new instance of the Controller
        Controller controller = new Controller();
        
        // Call the greet method with a custom name
        Greeting response = controller.greet("John");
        
        // Assert that the returned response is correct
        assertThat(response.getMessage()).isEqualTo("Hello, John!");
    }
}
