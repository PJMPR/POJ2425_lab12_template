package org.example.zad7;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IoCContainerTest {

    @Test
    public void shouldThrowIfComponentNotFound() {
        IoCContainer container = new IoCContainer();

        assertThrows(IllegalArgumentException.class, () -> {
            container.resolve("missing");
        });
    }
}

