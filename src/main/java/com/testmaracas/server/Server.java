package com.testmaracas.server;

public class Server {
    // Change the signature of this API
    public String doStuff(String name) {
        // Implementation of doStuff method
        System.out.println("Doing stuff...");
        // Hey name, I am doing stuff for you
        String prefix = "Hey " + name + ", ";
        return prefix + "Stuff done for you!";
    }

    // remove this method which means to remove one API offered by the server
    // public String echo(String message) {
    // // Implementation of echo method
    // return message;
    // }

    public String echo(String message, int times) {
        // Implementation of echo method
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(message);
        }
        return sb.toString();
    }

    // This is a new API offered by the server
    public String newEcho(String message) {
        // Implementation of echo method
        return "From new Echo: " + message;
    }
}