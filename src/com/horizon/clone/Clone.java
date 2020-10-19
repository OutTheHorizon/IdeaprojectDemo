package com.horizon.clone;

import java.lang.reflect.Field;

public class Clone {
    public void cloneSur(Object o){
        Field[] fs= o.getClass().getDeclaredFields();
        for (Field f : fs) {
            
        }
    }
}
