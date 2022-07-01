package com.smgeek.gkrpc.example;

import com.smgeek.gkrpc.client.RpcClient;

/**
 * @author yezw
 * @create 2022-07-01 0:10
 */
public class Client {
    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);
        int r1 = service.add(1,2);
        int r2 = service.minus(3,4);
        System.out.println(r1);
        System.out.println(r2);
    }
}
