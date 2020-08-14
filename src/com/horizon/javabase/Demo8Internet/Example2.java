package com.horizon.javabase.Demo8Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example2 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
    }
}
