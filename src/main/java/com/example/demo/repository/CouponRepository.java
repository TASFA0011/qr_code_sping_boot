package com.example.demo.repository;

import com.example.demo.model.CouponModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<CouponModel, Integer> {

    @Override
    CouponModel save(CouponModel couponModel);
}
