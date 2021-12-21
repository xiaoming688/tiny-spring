package com.demo.gcm.springframework.beans.factory;

import com.demo.gcm.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
