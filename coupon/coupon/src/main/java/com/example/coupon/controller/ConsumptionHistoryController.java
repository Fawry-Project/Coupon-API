package com.example.coupon.controller;

import com.example.coupon.entity.ConsumptionHistory;
import com.example.coupon.service.ConsumptionHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/coupons")
public class ConsumptionHistoryController {
    @Autowired
    private ConsumptionHistoryService chService;

    @GetMapping("history")
    public List<ConsumptionHistory> findAll(){
        return chService.findAll();
    }

    @GetMapping("history/{couponCode}")
    public List<ConsumptionHistory> getCouponHistory(@PathVariable String couponCode){
        return chService.getCouponConsumptions(couponCode);
    }
}
