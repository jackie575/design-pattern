package com.jackie.common.design_pattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecoratorPatternDemo {
    public static void main(String[] args) throws IOException {
        InputStream file = new FileInputStream("someFile");
        // “基础”的读操作
        System.out.println(file.read());

        // 装饰器包装的InputStream
        InputStream bufferedInputStream = new BufferedInputStream(file);
        // “装饰器包装”的读操作
        System.out.println(bufferedInputStream.read());

    }
}