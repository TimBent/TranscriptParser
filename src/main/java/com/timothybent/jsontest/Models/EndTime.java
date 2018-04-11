package com.timothybent.jsontest.Models;

public class EndTime {
    public Seconds seconds;
    public int nanos;

    public EndTime(Seconds seconds, int nanos) {
        this.seconds = seconds;
        this.nanos = nanos;
    }
}
