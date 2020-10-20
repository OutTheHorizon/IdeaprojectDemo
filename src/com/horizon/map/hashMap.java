package com.horizon.map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("hz", "hzl");
        System.out.println( map.get("hz"));
    }
}
