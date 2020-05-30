package com.company;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class Main {

    public static void main(String[] args)  {
        Input in = new Input();
        String sumName = in.sumName();
        Output out = new Output();
        out.sumInfo(sumName);

    }
}