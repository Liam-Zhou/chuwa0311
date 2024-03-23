package com.chuwa.learn.design_pattern.creational.publish_subscribe;

public class WeiXinUser implements Subscriber {

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}