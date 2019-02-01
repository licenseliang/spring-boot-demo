/**
 * Copyright (C), 2017-2019, 珠海联创工场技术有限公司
 * FileName: RabbitConfig
 * Author:   license
 * Date:     19-2-1 上午11:28
 * Description: rabbitmq配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sal.account.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br>
 * 〈rabbitmq配置类〉
 *
 * @author license
 * @create 19-2-1
 * @since 1.0.0
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
