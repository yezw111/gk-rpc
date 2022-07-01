package com.smgeek.gkrpc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 表示网络传输的一个端点
 * @author yezw
 * @create 2022-06-28 13:11
 */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
