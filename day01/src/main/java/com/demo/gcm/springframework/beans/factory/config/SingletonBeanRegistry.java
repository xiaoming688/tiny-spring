package com.demo.gcm.springframework.beans.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}