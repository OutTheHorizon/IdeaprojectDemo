package com.horizon.javabase;

import java.util.HashSet;
import java.util.Set;

public class HashCodeDemo1 {
    private int hashCodeId;

    public int getHashCodeId() {
        return hashCodeId;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HashCodeDemo1)) {
            return false;
        }
        HashCodeDemo1 other = (HashCodeDemo1) obj;
        if (other.getHashCodeId() == this.getHashCodeId()) {
            return true;
        }
        return false;
    }

    public void setHashCodeId(int hashCodeId) {
        this.hashCodeId = hashCodeId;
    }

    public int hashCode(){
        return hashCodeId % 10;
    }

    public final static void main(String[] args){
        HashCodeDemo1 a = new HashCodeDemo1();
        HashCodeDemo1 b = new HashCodeDemo1();
        a.setHashCodeId(2);
        b.setHashCodeId(2);
        Set<HashCodeDemo1> set = new HashSet<>();
        System.out.println(a.hashCodeId == b.hashCodeId);
        System.out.println(a.equals(b));
        set.add(a);
        set.add(b);
        System.out.println(set);
    }
}

