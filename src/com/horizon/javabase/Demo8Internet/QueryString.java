package com.horizon.javabase.Demo8Internet;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class QueryString {
    private StringBuffer query = new StringBuffer();
    public QueryString(String name, String value){
        encode(name, value);
    }
    public static void main(String[] args){
        QueryString qs = new QueryString("pg","q");
        qs.add("kl","XX");
        qs.add("stype","stext");
        qs.add("q","+\"Java I/O\"");
        qs.add("search.x","38");
        qs.add("search.y","3");
        String url = "http://www.altavista.com/cgi-bin/query?" +
                "qs";
        System.out.println(url);
    }

    public synchronized void add(String name, String value){
        query.append('&');
        encode(name, value);
    }
    private synchronized void encode(String name, String value){
        try {
            query.append(URLEncoder.encode(name, "UTF-8"));
            query.append('=');
            //我日了胡仕清你妈的逼！
            //胡仕清你妈的逼就在大街上被人日。就是奸了胡仕清你妈的逼！！！
            query.append((URLEncoder.encode(value, "UTF-8")));
        }catch (UnsupportedEncodingException ex){
            throw  new RuntimeException("Broken VM does not support UTF-8");
        }
    }
    public String getQuery(){
        return query.toString();
    }
    public String toString(){
        return getQuery();
    }
}
