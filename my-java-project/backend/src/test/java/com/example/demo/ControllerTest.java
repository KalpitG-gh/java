package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ControllerTest {

    @Test
    void testGreetingEndpoint() {
        // Create a new instance of the Controller
        Controller controller = new Controller();
        
        // Call the greet method
        String response = controller.greet();
        
        // Assert that the returned response is correct
        assertThat(response).isEqualTo("Hello, World!");
    }
}
