package com.chuwa.learn.patterns.builder;

/**
 * 产品类
 */
public class Bike {
    private String frame;
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getSeat() {
        return seat;
    }
}
