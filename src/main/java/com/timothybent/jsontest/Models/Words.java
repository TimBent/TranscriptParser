package com.timothybent.jsontest.Models;

public class Words {
    public EndTime startTime;
    public EndTime endTime;
    public String word;

    public Words(EndTime startTime, EndTime endTime, String word){
        this.startTime = startTime;
        this.endTime = endTime;
        this.word = word;
    }
}
