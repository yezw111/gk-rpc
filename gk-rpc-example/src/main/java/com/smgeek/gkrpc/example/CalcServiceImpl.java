package com.smgeek.gkrpc.example;

/**
 * @author yezw
 * @create 2022-07-01 0:11
 */
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
