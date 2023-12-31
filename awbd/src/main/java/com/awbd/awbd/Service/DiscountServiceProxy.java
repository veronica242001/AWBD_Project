package com.awbd.awbd.Service;

import com.awbd.awbd.model.Discount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "discount", url = "localhost:8081")
public interface DiscountServiceProxy {
    @GetMapping(value = "/discount", consumes = "application/json")
    Discount findDiscount();
}