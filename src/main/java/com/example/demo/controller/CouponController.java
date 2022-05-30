package com.example.demo.controller;

import com.example.demo.model.CouponModel;
import com.example.demo.repository.CouponRepository;
import com.example.demo.utils.MyQrCode;
import com.google.zxing.WriterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path = "api/coupon")
public class CouponController {

    @Autowired
    public CouponRepository couponRepository;

    @PostMapping
    public CouponModel registerCoupon(CouponModel couponModel) throws IOException, WriterException {
        MyQrCode.generateQr(couponModel);
        return couponRepository.save(couponModel);
    }
}
