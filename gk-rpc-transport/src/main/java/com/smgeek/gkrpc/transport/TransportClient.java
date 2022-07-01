package com.smgeek.gkrpc.transport;

import com.smgeek.gkrpc.Peer;

import java.io.InputStream;

/**
 * @author yezw
 * @create 2022-06-30 21:53
 */
public interface  TransportClient {
    void connect(Peer peer);
    InputStream write(InputStream data);
    void close();
}
