package com.smgeek.gkrpc.server;

import com.smgeek.gkrpc.codec.Decoder;
import com.smgeek.gkrpc.codec.Encoder;
import com.smgeek.gkrpc.codec.JSONDecoder;
import com.smgeek.gkrpc.codec.JSONEncoder;
import com.smgeek.gkrpc.transport.HttpTransportServer;
import com.smgeek.gkrpc.transport.TransportClient;
import com.smgeek.gkrpc.transport.TransportServer;
import lombok.Data;

/**
 * @author yezw
 * @create 2022-06-30 22:24
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HttpTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;

}
