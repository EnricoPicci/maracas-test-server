package com.testmaracas.server;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ServerTest {

    @Test
    public void testDoStuff() {
        Server server = new Server();
        String result = server.doStuff("Andrea");
        String prefix = "Hey Andrea, ";
        assertEquals(prefix + "Stuff done for you!", result);
    }

    // test removed because the echo method has been removed
    // @Test
    // public void testEcho() {
    // Server server = new Server();
    // String result = server.echo("Hello, world!");
    // assertEquals("Hello, world!", result);
    // }

    @Test
    public void testEchoWithTimes() {
        Server server = new Server();
        String result = server.echo("Hello, world!", 3);
        assertEquals("Hello, world!Hello, world!Hello, world!", result);
    }

    @Test
    public void testNewEcho() {
        Server server = new Server();
        String result = server.newEcho("Hello, world!");
        assertEquals("From new Echo: Hello, world!", result);
    }
}