package com.smgeek.gkrpc.codec;

/**
 * @author yezw
 * @create 2022-06-30 21:37
 */
public interface Encoder {
    byte[] encode(Object obj);
}
