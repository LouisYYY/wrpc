package org.white.wrpc.hello.test;

import org.white.wrpc.consumer.RPCConsumer;
import org.white.wrpc.consumer.constant.ConsumerConstant;
import org.white.wrpc.hello.model.request.HelloRequest;
import org.white.wrpc.hello.model.response.HelloResponse;
import org.white.wrpc.hello.service.HelloService;

import com.alibaba.fastjson.JSON;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: Consumer.java, v 0.1 2018年10月16日 14:56:00 baixiong Exp$
 */
public class Consumer {

    public static void main(String[] args) {
        RPCConsumer consumer = new RPCConsumer();
        HelloService helloService = consumer.getBean(HelloService.class, ConsumerConstant.APP_CODE);
        int i = 0;
        while (true) {
            HelloRequest request = new HelloRequest();
            request.setSeq(i++);
            HelloResponse helloResponse = helloService.hello(request);
            System.out.println("客户端收到响应:" + JSON.toJSONString(helloResponse));
        }
    }
}