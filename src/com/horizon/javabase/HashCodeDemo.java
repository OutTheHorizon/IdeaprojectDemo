package com.horizon.javabase;

import java.util.HashSet;
import java.util.Set;

public class HashCodeDemo {
    private int hashCodeId;

    public int getHashCodeId() {
        return hashCodeId;
    }

    public void setHashCodeId(int hashCodeId) {
        this.hashCodeId = hashCodeId;
    }

    public int hashCode(){
        return hashCodeId%10;
    }

    public final static void main(String[] args){
        HashCodeDemo a = new HashCodeDemo();
        HashCodeDemo b = new HashCodeDemo();
        a.setHashCodeId(2);
        b.setHashCodeId(2);
        Set<HashCodeDemo> set = new HashSet<>();
        System.out.println(a.hashCodeId == b.hashCodeId);
        System.out.println(a.equals(b));
        set.add(a);
        set.add(b);
        System.out.println(set);
    }
}

