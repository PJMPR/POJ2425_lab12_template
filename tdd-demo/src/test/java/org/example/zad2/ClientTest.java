package org.example.zad2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    @Test
    public void shouldDelegateWorkToService() {
        Service mockService = new MockService();

        Client client = new Client(mockService);
        assertEquals("Mocked", client.doWork());
    }

    class MockService implements Service {
        public String serve() {
            return "Mocked";
        }
    }
}

