package com.dawn.model;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author 若晨曦
 * @CLASS_NAME Consumer
 * @PROJECT_NAME rabbitmq-api
 * @PACKAGE_NAME com.dawn.model
 * @CREATE_TIME 2020/2/21 8:59
 */
public class Consumer {

    public static void main(String[] args) throws IOException, TimeoutException {
        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //通过连接工厂创建连接
        Connection connection = factory.newConnection();
        //通过连接创建消息channel
        Channel channel = connection.createChannel();

    }

}
