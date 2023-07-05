package org.example.services;

import org.example.dao.mapper.XmlMapperDemo;
import org.example.entity.Order;
import org.example.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class OrderService {
    private final XmlMapperDemo xmlMapperDemo;

    public OrderService(XmlMapperDemo xmlMapperDemo) {
        this.xmlMapperDemo = xmlMapperDemo;
    }

    public void addOrder(int count){
        System.out.println("provider.OrderService.addOrder" + count);
    }

    public Order getOrder(int orderId){
        Order order = xmlMapperDemo.getOrder(orderId);
        return order;
    }

    public Order getRelatedProducts(int orderId){
        Order relatedProducts = xmlMapperDemo.getRelatedProducts(orderId);
        return relatedProducts;
    }

    public List<Order> getOrderLst(){
        List<Order> orderLst = xmlMapperDemo.getOrderLst();
        return orderLst;
    }

    public Map<Integer, Order> getOrderMap(){
        Map<Integer, Order> orderMap = xmlMapperDemo.getOrderMap();
        return orderMap;
    }

    @Transactional
    public void updateIntFieid1(){
        xmlMapperDemo.updateIntField1();
        updateIntFieid2();
    }

    @Transactional
    public void updateIntFieid2(){
        xmlMapperDemo.updateIntField2();
    }
}
