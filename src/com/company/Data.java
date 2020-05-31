package com.company;

public class Data {
    private int id;
    private String rank_solo;
    private String rank_flex;
    private String rank_tft;
    private Object matchhistory;
    private Object championData;

    public Data(int id, String rank_solo, String rank_flex, String rank_tft, Object matchhistory, Object championData) {
        this.id = id;
        this.rank_solo = rank_solo;
        this.rank_flex = rank_flex;
        this.rank_tft = rank_tft;
        this.matchhistory = matchhistory;
        this.championData = championData;
    }
}
