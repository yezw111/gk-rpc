package com.smgeek.gkrpc.codec;

/**
 * @author yezw
 * @create 2022-06-30 21:41
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
