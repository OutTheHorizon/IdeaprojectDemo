package com.horizon.javabase.Demo8Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example1 {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.baidu.com");
        System.out.println(address);
        System.out.println("-----");
        InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
        for(InetAddress add: addresses){
            System.out.println(add);
        }
    }
}
