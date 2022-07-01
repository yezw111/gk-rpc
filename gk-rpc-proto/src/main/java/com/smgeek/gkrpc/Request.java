package com.smgeek.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yezw
 * @create 2022-06-28 13:17
 */
@Data
public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}
