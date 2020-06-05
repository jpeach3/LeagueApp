package com.company;


import net.rithms.riot.api.RiotApiException;

public class Main {

    public static void main(String[] args) throws RiotApiException {
        Input in = new Input();
        Info info = new Info();
        String sumName = in.sumName();
        Output out = new Output();
        System.out.println("rank: " + info.RankSolo(sumName));

    }
}