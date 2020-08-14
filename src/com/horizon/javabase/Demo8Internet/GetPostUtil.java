package com.horizon.javabase.Demo8Internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class GetPostUtil {
    public static void main(String[] args){
        System.out.println(sendGet("http://www.baidu.com", ""));
    }

    public static String sendGet(String url, String params){
        String result = "";
        BufferedReader in = null;

        try {
            //进行配置
            String urlName;
            if(!params.equals("")) {
                urlName = url + "?" + params;
            }else{
                urlName = url;
            }
            URL realUrl;
            //在此把Url地址传进去了
            realUrl = new URL(urlName);
            //建立连接
            URLConnection conn = realUrl.openConnection();
            //设置连接属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0(compatible;MSIE)");
            //正式连接
            conn.connect();
            //集合放置获得的文件头信息
            Map<String, List<String>> map = conn.getHeaderFields();
            for (String key : map.keySet()) {
                System.out.println(key + "-->" + map.get(key));
            }
            //获得信息的输入流并复制到新的输入流后写进read流里。
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            //一行行读取并输出
            String line;
            while ((line = in.readLine()) != null) {
                result += "\n" + line;
            }
        }catch (Exception e){
            //TODO Auto-generated catch block
            System.out.println("发送GET请求出现异常！"+e);
            e.printStackTrace();
        }finally {
            if(in!=null){
                try {
                    in.close();
                }catch (IOException e){
                    //TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
    public static String sendPost(String url, String params){
        PrintWriter out = null;
        BufferedReader br=null;
        String result = "";
        try {
            URL realURL = new URL(url);
            URLConnection conn = realURL.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0(compatible;MSIE)");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            out = new PrintWriter(conn.getOutputStream());
            out.print(params);
            out.flush();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                result += "\n" + line;
            }
        }catch (Exception e){
            System.out.println("程序出现异常"+e);
            e.printStackTrace();
        }finally {
            try {
                if(br != null){
                    br.close();
                }
                if(out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  result;
    }
}
