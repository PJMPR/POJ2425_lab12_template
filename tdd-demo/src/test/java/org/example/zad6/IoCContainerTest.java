package org.example.zad6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IoCContainerTest {

    @Test
    public void shouldInjectDependencyIntoClient() {
        IoCContainer container = new IoCContainer();
        container.register("service", new ServiceAFactory());
        container.register("client", new ClientFactory(container));

        Object result = container.resolve("client");

        assertNotNull(result);
        assertTrue(result instanceof Client);

        Client client = (Client) result;
        assertEquals("ServiceA", client.doWork());
    }
}

