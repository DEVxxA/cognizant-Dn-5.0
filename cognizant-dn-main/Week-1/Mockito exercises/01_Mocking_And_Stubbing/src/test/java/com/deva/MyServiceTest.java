package com.deva;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Hello from Deva!!!");
        MyService service = new MyService(mockApi);
        String result = service.fetchData();
        assertEquals("Hello from Deva!!!", result);
    }
}
