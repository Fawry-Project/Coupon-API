package com.example.coupon.controller;

import com.example.coupon.dto.CouponDTO;
import com.example.coupon.dto.consumeCouponDTO;
import com.example.coupon.entity.Coupon;
import com.example.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:4200")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @GetMapping("coupons")
    public List<Coupon> getAllCoupons(){
        return couponService.findAll();
    }

    @GetMapping("coupons/{code}")
    public Coupon findByCode(@PathVariable String code){
        return couponService.findByCode(code);
    }

    @PostMapping("coupons")
    public Coupon createCoupon(@RequestBody CouponDTO couponDTO){
        return couponService.createCoupon(couponDTO);
    }

    @DeleteMapping("coupons/{code}")
    public void deleteCoupon(@PathVariable String code){
        couponService.deleteCoupon(code);
    }

    @PutMapping("coupons/{code}")
    public Coupon updateCoupon(@PathVariable String code,@RequestBody CouponDTO couponDTO){
        return couponService.updateCoupon(code, couponDTO);
    }

    @PostMapping("coupons/consume")
    public Coupon consume(@RequestBody consumeCouponDTO consumeCouponDTO){
        return couponService.consume(consumeCouponDTO);
    }
    @DeleteMapping("coupons/cancel-consumption")
    public void cancelCouponConsumption(@RequestBody consumeCouponDTO consumeCouponDTO){
        couponService.cancelCouponConsumption(consumeCouponDTO);
    }
}
