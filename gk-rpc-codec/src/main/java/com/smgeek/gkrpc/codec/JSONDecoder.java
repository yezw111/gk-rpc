package com.smgeek.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @author yezw
 * @create 2022-06-30 21:44
 */
public class JSONDecoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes,clazz);
    }
}
