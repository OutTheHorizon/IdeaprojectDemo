package com.horizon.streamdemo;

import java.util.List;

public class Stream{
    private static Stream mStream; //返回一个Stream对象
    private String mNeedProcessString = null;
    private char[] mStrArrays = new char[100];

    public Stream setNeedProcessString(String needProcessString) {
        mNeedProcessString = needProcessString;
        return mStream;
    }


    public static Stream initStream() {
        if(mStream == null) {
            mStream = new Stream();
        }
        return mStream;
    }

    public Stream toArray(){
        mStrArrays = mNeedProcessString.toCharArray();
        return mStream;
    }

    public Stream check(){
        for (int i = 0; i < mStrArrays.length; i++) {
            if(mStrArrays[i]>='0'&&mStrArrays[i]<='9'){
                continue;
            }else if(mStrArrays[i]=='+' || mStrArrays[i]=='-' || mStrArrays[i]=='*' || mStrArrays[i]=='/'){
                continue;
            }else{
                mNeedProcessString="";
                mStrArrays = mNeedProcessString.toCharArray();
                return mStream;
            }
        }
        return mStream;
    }

    public Stream calculate(){
        return mStream;
    }

    public String result(){
        return "12345566";
    }

    public static void main(String[] args){
        System.out.println(
            Stream.initStream()
                    .setNeedProcessString("2+3+4+5+45")
                    .check()
                    .calculate()
                    .result()
        );
    }
}
