package com.fgrapp.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * LoadBalancer
 *
 * @author fan guang rui
 * @date 2020年10月25日 11:05
 */
public interface LoadBalancer
{
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
