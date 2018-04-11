package com.timothybent.jsontest.Models;

public class Alternatives {
    public String transcript;
    public double confidence;
    public Words[] words;

    public Alternatives(String transcript, double confidence, Words[] words) {
        this.transcript = transcript;
        this.confidence = confidence;
        this.words = words;
    }
}
