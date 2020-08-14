package com.horizon.javabase.Demo8Internet;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetHttpOntheInternet {
//    void getHttps() {
//        HttpURLConnection conn = null;
//        try {
//            URL my_url = new URL(log());
//            //得到connection对象。
//            conn = (HttpURLConnection) my_url.openConnection();
//            //允许写出
//            conn.setDoOutput(true);
//            //允许读入
//            conn.setDoInput(true);
//            //设置请求方式
//            conn.setRequestMethod("POST");
//            conn.setUseCaches(false);
//            conn.setConnectTimeout(60 * 1000);
//            conn.setReadTimeout(60 * 1000);
//            //设置请求头
//            conn.setRequestProperty("Charsert", "UTF-8");
//            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");//设置参数类型是json格式
//            conn.setRequestProperty("Connection", "Keep-Alive");
//            conn.setRequestProperty("logType", "base");
//            /**
//             * 带cookies 请求怎么搞
//             * httpConnection.setRequestProperty("Cookie", "JSESSIONID="+SessionId);
//             */
//            //连接网络。请求行，请求头的设置必须放在网络连接前
//            conn.connect();
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8"));
//            boolean hashMap = false;
//            writer.write(String.valueOf(hashMap));
//            writer.close();
//            //得到响应码
//            int responseCode = conn.getResponseCode();
//            MyLogcat.e("网络传输" + responseCode + "***" + conn.getResponseMessage() + String.valueOf(hashMap));
//            if (responseCode == 200) {
//                //得到响应流
//                InputStream inputStream = conn.getInputStream();
//                //将响应流转换成字符串
//                String returnLine = getStringFromInputStream(inputStream);
//                String str = "Success" + conn.getResponseCode() + "---" + conn.getResponseMessage() + "---" + returnLine;
//            } else {
//                String str = "Error" + conn.getResponseCode() + "---" + conn.getResponseMessage();
//
//            }
//
//        } catch (
//                Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (conn != null) {
//                conn.disconnect();
//            }
//        }
//    }
//
//
//    /**
//     * 通过字节输入流返回一个字符串信息
//     */
//    private static String getStringFromInputStream(InputStream is) throws Exception {
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        byte[] buffer = new byte[1024];
//        int len = 0;
//        while ((len = is.read(buffer)) != -1) {
//            baos.write(buffer, 0, len);
//        }
//        is.close();
//        // 把流中的数据转换成字符串, 采用的编码是: utf-8
//        String status = baos.toString();
//        baos.close();
//        return status;
//    }
}
