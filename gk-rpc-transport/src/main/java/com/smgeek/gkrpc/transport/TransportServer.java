package com.smgeek.gkrpc.transport;

/**
 * @author yezw
 * @create 2022-06-30 21:55
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);//此时传一个RequestHandler
    void start();

    void stop();
}
