/**
 * Copyright (C), 2017-2019, 珠海联创工场技术有限公司
 * FileName: HelloApplicationTests
 * Author:   license
 * Date:     19-2-1 上午11:31
 * Description: 消息生成测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sal.account.rabbitmq;

import com.sal.account.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br>
 * 〈消息生成测试类〉
 *
 * @author license
 * @create 19-2-1
 * @since 1.0.0
 */
public class HelloApplicationTests extends BaseTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        sender.send();
    }
}
