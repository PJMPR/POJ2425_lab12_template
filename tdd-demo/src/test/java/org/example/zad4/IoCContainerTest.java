package org.example.zad4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IoCContainerTest {

    @Test
    public void shouldResolveRegisteredComponent() {
        IoCContainer container = new IoCContainer();
        container.register("service", new ServiceAFactory());

        Object result = container.resolve("service");

        assertNotNull(result);
        assertTrue(result instanceof Service);
        assertEquals("ServiceA", ((Service) result).serve());
    }
}

