package com.smgeek.gkrpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @author yezw
 * @create 2022-06-30 21:43
 */
public class JSONEncoder implements Encoder{
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
