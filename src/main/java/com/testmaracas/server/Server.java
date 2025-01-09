package com.testmaracas.server;

public class Server {
    public String doStuff() {
        // Implementation of doStuff method
        System.out.println("Doing stuff...");
        return "Stuff done!";
    }

    public String echo(String message) {
        // Implementation of echo method
        return message;
    }

    public String echo(String message, int times) {
        // Implementation of echo method
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(message);
        }
        return sb.toString();
    }
}