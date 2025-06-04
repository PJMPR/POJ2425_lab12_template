package org.example.zad1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceATest {

    /**
     * Zad 1
     */
    @Test
    public void shouldReturnExpectedServeValue() {
        Service service = new ServiceA();
        assertEquals("ServiceA", service.serve());
    }
}

