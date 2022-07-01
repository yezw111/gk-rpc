package com.smgeek.gkrpc;

import lombok.Data;

/**
 * @author yezw
 * @create 2022-06-28 13:19
 */
@Data
public class Response {
    /**
     * 服务返回编码，0-成功，非0失败
     */
    private int code = 0;
    private String message = "ok";
    private Object data;
}
