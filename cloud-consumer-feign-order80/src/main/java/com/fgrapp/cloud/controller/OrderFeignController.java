package com.fgrapp.cloud.controller;

import com.fgrapp.cloud.entities.CommonResult;
import com.fgrapp.cloud.entities.Payment;
import com.fgrapp.cloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * OrderFeignController
 *
 * @author fan guang rui
 * @date 2020年10月25日 11:37
 */
@RestController
@Slf4j
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

}
