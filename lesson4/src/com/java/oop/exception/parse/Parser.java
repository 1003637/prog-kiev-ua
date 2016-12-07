package com.java.oop.exception.parse;

import com.java.oop.exception.parse.MyIllegalArgumentException;

public class Parser {
    public void parse(String url) throws MyIllegalArgumentException {
        String[] str = url.split("&");

        if (str.length != 3){
            throw new MyIllegalArgumentException("Illegal list arguments");
        }

        for (int i = 0; i < str.length; i++){
            String[] str1 = str[i].split("=");
                if (str1.length != 2) {
                    throw new MyIllegalArgumentException("Illegal list arguments");
                }
        }
    }
}
