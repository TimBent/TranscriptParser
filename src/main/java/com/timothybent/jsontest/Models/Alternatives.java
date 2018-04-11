package com.timothybent.jsontest.Models;

import java.util.ArrayList;

public class Alternatives {
    public String transcript;
    public double confidence;
    public ArrayList<Words> words;

    public Alternatives(String transcript, double confidence, ArrayList<Words> words) {
        this.transcript = transcript;
        this.confidence = confidence;
        this.words = words;
    }
}
