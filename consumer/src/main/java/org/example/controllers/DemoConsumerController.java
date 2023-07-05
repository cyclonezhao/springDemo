package org.example.controllers;

import org.example.remote.services.ProviderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {
    private final ProviderClient providerClient;

    public DemoConsumerController(ProviderClient providerClient) {
        this.providerClient = providerClient;
    }

    // 应该用 PatchMapping，这里为了方便浏览器使用就用了get
    @GetMapping("/addorder/{count}")
    public String addOrder(@PathVariable int count){
        try{
            System.out.println("consumer.addOrder2 = " + count);
            providerClient.addOrder(count);
            return "success";
        }catch(Exception e){
            return "fail";
        }
    }
}
