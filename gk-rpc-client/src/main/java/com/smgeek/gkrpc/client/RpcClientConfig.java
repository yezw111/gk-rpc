package com.smgeek.gkrpc.client;

import com.smgeek.gkrpc.Peer;
import com.smgeek.gkrpc.codec.Decoder;
import com.smgeek.gkrpc.codec.Encoder;
import com.smgeek.gkrpc.codec.JSONDecoder;
import com.smgeek.gkrpc.codec.JSONEncoder;
import com.smgeek.gkrpc.transport.HTTPTranspotClient;
import com.smgeek.gkrpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author yezw
 * @create 2022-06-30 23:33
 */
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass =
            HTTPTranspotClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass =
            RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(new Peer("127.0.0.1",3000));
}
