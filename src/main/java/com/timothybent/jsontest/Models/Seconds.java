package com.timothybent.jsontest.Models;

public class Seconds {
    public int low;
    public int high;
    public boolean unsigned;

    public Seconds(int low, int high, boolean unsigned) {
        this.low = low;
        this.high = high;
        this.unsigned = unsigned;
    }
}
