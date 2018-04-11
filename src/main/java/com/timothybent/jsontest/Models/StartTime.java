package com.timothybent.jsontest.Models;

public class StartTime {
    public Seconds seconds;
    public int nanos;

    public StartTime(Seconds seconds, int nanos) {
        this.seconds = seconds;
        this.nanos = nanos;
    }
}
