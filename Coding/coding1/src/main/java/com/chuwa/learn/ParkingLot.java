package com.chuwa.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class ParkingLot {
    private List<Level> levels;

    public ParkingLot(ArrayList<Level> levels) {
        this.levels = levels;
    }

    public void setLevels(ArrayList<Level> levels) {
        this.levels = levels;
    }

    public List<Level> getLevels() {
        return this.levels;
    }
}
