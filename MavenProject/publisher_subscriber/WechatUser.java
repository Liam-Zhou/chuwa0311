package org.example.publisher_subscriber;

public class WechatUser implements Observer {
    private String name;

    public WechatUser(String name) {
        this.name = name;
    }

    @Override
    public void update() {

    }
}
