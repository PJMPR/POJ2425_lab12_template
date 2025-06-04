package org.example.zad5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientFactoryTest {

    @Test
    public void shouldCreateClientWithInjectedService() {
        IoCContainer container = new IoCContainer();
        container.register("service", new ServiceAFactory());

        ClientFactory factory = new ClientFactory(container);
        Object obj = factory.create();

        assertNotNull(obj);
        assertTrue(obj instanceof Client);

        Client client = (Client) obj;
        assertEquals("ServiceA", client.doWork());
    }
}

