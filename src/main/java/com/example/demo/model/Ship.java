package com.example.demo.model;

import com.example.demo.enums.Mast;

public class Ship {
    private Mast mast;

private int hitCount;

    public Ship(Mast mast, int hitCount) {
        this.mast = mast;
        this.hitCount = hitCount;
    }

    public Ship(Mast mast) {
        this.mast = mast;
        this.hitCount = 0;

    }

    public Mast getMast() {
        return mast;
    }

    public void setMast(Mast mast) {
        this.mast = mast;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
