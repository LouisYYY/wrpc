package org.white.wrpc.hello.service.impl;

import org.white.wrpc.hello.model.request.HelloRequest;
import org.white.wrpc.hello.model.response.HelloResponse;
import org.white.wrpc.hello.service.HelloService;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: HelloServiceImpl.java, v 0.1 2018年10月16日 14:20:00 baixiong Exp$
 */
public class HelloServiceImpl implements HelloService {

    public HelloResponse hello(HelloRequest request) {
        System.out.println("服务端收到请求,序列号:" + request.getSeq());
        HelloResponse response = new HelloResponse();
        response.setCode(200);
        response.setMessage("success:" + request.getSeq());
        return response;
    }
}