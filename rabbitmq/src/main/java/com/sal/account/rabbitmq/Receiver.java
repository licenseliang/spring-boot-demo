/**
 * Copyright (C), 2017-2019, 珠海联创工场技术有限公司
 * FileName: Receiver
 * Author:   license
 * Date:     19-2-1 上午11:27
 * Description: 消息消费者
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sal.account.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈消息消费者〉
 *
 * @author license
 * @create 19-2-1
 * @since 1.0.0
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver: " + hello);
    }
}
