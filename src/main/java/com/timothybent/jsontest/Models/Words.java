package com.timothybent.jsontest.Models;

public class Words {
    public StartTime startTime;
    public EndTime endTime;
    public String word;

    public Words(StartTime startTime, EndTime endTime, String word){
        this.startTime = startTime;
        this.endTime = endTime;
        this.word = word;
    }
}
