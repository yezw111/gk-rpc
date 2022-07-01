package com.smgeek.gkrpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yezw
 * @create 2022-06-30 21:45
 */
public class JSONEncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();
        TestBean bean = new TestBean();
        bean.setName("smgeek");
        bean.setAge(18);
        byte[] bytes = encoder.encode(bean);

        assertNotNull(bytes);
    }
}