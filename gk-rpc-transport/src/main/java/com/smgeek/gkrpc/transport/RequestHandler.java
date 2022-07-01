package com.smgeek.gkrpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author yezw
 * @create 2022-06-30 21:57
 */
public interface RequestHandler {
    void onRequest(InputStream receive, OutputStream toResp);
}
