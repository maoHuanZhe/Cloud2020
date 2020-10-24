package com.fgrapp.cloud.service;

import com.fgrapp.cloud.dao.PaymentDao;
import com.fgrapp.cloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author fan guang rui
 * @date 2020年06月13日 18:10
 */
@Service
public class PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
