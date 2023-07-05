package org.example.remote.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider")
public interface ProviderClient {
    @RequestMapping(method= RequestMethod.PATCH, value="/business/addorder/{count}")
    String addOrder(@RequestParam int count);
}
