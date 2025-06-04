package org.example.zad3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceAFactoryTest {

    @Test
    public void shouldCreateServiceAInstance() {
        ServiceAFactory factory = new ServiceAFactory();
        Object obj = factory.create();

        assertNotNull(obj);
        assertTrue(obj instanceof Service);
        assertEquals("ServiceA", ((Service) obj).serve());
    }
}

