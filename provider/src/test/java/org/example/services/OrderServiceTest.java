package org.example.services;

import org.example.entity.Order;
import org.example.entity.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderServiceTest {

    @Resource
    private OrderService orderService;

    @Test
    public void addOrder() {
    }

    @Test
    public void getOrder() {
        Order order = orderService.getOrder(1);
        Assert.assertEquals(1, order.getId());
    }

    @Test
    public void getRelatedProducts() {
        Order orders = orderService.getRelatedProducts(1);
        Set<String> productNames = orders.getProducts().stream().map(v -> v.getName()).collect(Collectors.toSet());
        Assert.assertTrue(productNames.contains("电脑主机"));
        Assert.assertTrue(productNames.contains("显示器"));
    }
}