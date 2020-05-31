package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

import java.io.FileWriter;
import java.io.IOException;

public class Output {

    Data[] data = new Data[] {
          new Data(1,"gold2", "gold3", "gold4", null, null),
            new Data(2,"gold4", "gold17", "gold3", null, null)
    };
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void createJsonDoc() {
            System.out.println(gson.toJson(data));
    }


    public void sumInfo(String sumName) {
        // riot api code
        try {
            ApiConfig config = new ApiConfig().setKey("RGAPI-57d96f99-0d3a-4d23-b286-9bbd5a20dd0f");
            RiotApi api = new RiotApi(config);


            // output in the java console
            Summoner summoner = api.getSummonerByName(Platform.EUW, sumName);
            System.out.println("Name: " + summoner.getName());
            System.out.println("Summoner ID: " + summoner.getId());
            System.out.println("Account ID: " + summoner.getAccountId());
            System.out.println("PUUID: " + summoner.getPuuid());
            System.out.println("Summoner Level: " + summoner.getSummonerLevel());
            System.out.println("Profile Icon ID: " + summoner.getProfileIconId());
        }catch (Exception e) {
            System.out.println("Error connecting to the Riot api");
        }
    }
}
