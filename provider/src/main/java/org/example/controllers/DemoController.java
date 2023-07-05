package org.example.controllers;

import org.example.dao.mapper.XmlMapperDemo;
import org.example.entity.Order;
import org.example.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DemoController {
    private final OrderService orderService;



    public DemoController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PatchMapping("/business/addorder/{count}")
    public String addOrder(@PathVariable int count){
        try{
            orderService.addOrder(count);
            return "success";
        }catch(Exception e){
            return "fail";
        }
    }

    @GetMapping("/business/getOrderUserName/{orderId}")
    public String getOrderUserName(@PathVariable int orderId){
        try{
            Order order = orderService.getOrder(orderId);
            return order.getUser().getName();
        }catch(Exception e){
            return "fail";
        }
    }

    @GetMapping("/business/getOrderLst")
    public String getOrderLst(){
        try{
            List<Order> orders = orderService.getOrderLst();
            return orders.toString();
        }catch(Exception e){
            return "fail";
        }
    }

    @GetMapping("/business/getOrderMap")
    public String getOrderMap(){
        try{
            Map<Integer, Order> orderMap = orderService.getOrderMap();
            System.out.println("sssssbbbb23ssbs:");
            return orderMap.toString();
        }catch(Exception e){
            e.printStackTrace();
            return "fail: " + e.toString();
        }
    }

    @GetMapping("/business/testTransaction")
    public String testTransaction(){
        try{
            orderService.updateIntFieid1();
            return "success\n";
        }catch(Exception e){
            return "fail";
        }
    }
}
