package com.madrapps.jacoco.operation;

public class StringOp {

    public boolean endsWith(String source, String chars) {
        System.out.println("s");
        return source.endsWith(chars);
    }

    public boolean startsWith(String source, String chars) {
        return source.startsWith(chars);
    }
}
