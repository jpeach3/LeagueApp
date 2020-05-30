package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    private String sumName = "";




    public String sumName() {
        java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your summoner Name ?");
        try {
            sumName = in.readLine();
        } catch (Exception e){
            sumName = "no summoner name Provided";
        }

        return sumName;
    }

}
