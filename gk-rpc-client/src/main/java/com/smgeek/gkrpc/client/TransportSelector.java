package com.smgeek.gkrpc.client;

import com.smgeek.gkrpc.Peer;
import com.smgeek.gkrpc.transport.TransportClient;
import sun.plugin2.message.transport.Transport;

import java.util.List;

/**
 * 表示选择那个server去连接
 * @author yezw
 * @create 2022-06-30 23:20
 */
public interface TransportSelector {

    void init(List<Peer> peers,int count,Class<? extends TransportClient> clazz);

    TransportClient select();

    void release(TransportClient client);

    void close();
}
