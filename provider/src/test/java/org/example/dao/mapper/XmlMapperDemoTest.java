package org.example.dao.mapper;

import org.example.Provider;
import org.example.entity.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XmlMapperDemoTest {

    @Autowired
    private XmlMapperDemo xmlMapperDemo;

    @Test
    public void testGetOrder(){
        Order order = xmlMapperDemo.getOrder(1);
        Assert.assertEquals("zhangsan", order.getUser().getName());
    }
}
