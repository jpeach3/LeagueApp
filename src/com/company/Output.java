package com.company;
import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.endpoints.match.MatchApiMethod;
import net.rithms.riot.api.endpoints.match.dto.Match;
import net.rithms.riot.api.endpoints.match.dto.MatchList;
import net.rithms.riot.api.endpoints.match.dto.Player;
import net.rithms.riot.api.endpoints.match.methods.GetMatchListByAccountId;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

import static net.rithms.riot.constant.Platform.EUW;


public class Output {

    private static FileWriter file;


    public void write() {
        JSONObject obj = new JSONObject();
        obj.put("ranked_solo", "gold1");
        obj.put("ranked_flex", "gold2");
        obj.put("ranked_tft", "gold3");

        JSONObject matchhistory = new JSONObject();
        JSONObject game_1 = new JSONObject();
        JSONObject summoner_1 = new JSONObject();
        JSONObject summoner_2 = new JSONObject();

        summoner_1.put("champion", "annie");
        summoner_1.put("sumName", "Starmental");
        summoner_1.put("stats", "10/0/0");
        summoner_1.put("cs", "0");

        summoner_2.put("champion", "ekko");
        summoner_2.put("sumName", "DasTrek");
        summoner_2.put("stats", "100/0/0");
        summoner_2.put("cs", "0");

        game_1.put("summoner_1", summoner_1);
        game_1.put("summoner_2", summoner_2);

        matchhistory.put("game_1", game_1);

        obj.put("matchhistory", matchhistory);
        try {
            file = new FileWriter("Jsontest.json");
            file.write(obj.toJSONString());
            System.out.println("wrote");
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void sumInfo(String sumName) {
        // riot api code
        try {
            ApiConfig config = new ApiConfig().setKey("RGAPI-d37a4f8f-be19-4f75-8372-99d842921d70");
            RiotApi api = new RiotApi(config);


            // output in the java console
            Summoner summoner = api.getSummonerByName(EUW, sumName);
            //System.out.println("Name: " + summoner.getName());
         //   System.out.println("Summoner ID: " + summoner.getId());
           // System.out.println("Account ID: " + summoner.getAccountId());
            //System.out.println("PUUID: " + summoner.getPuuid());
            //System.out.println("Summoner Level: " + summoner.getSummonerLevel());
            //System.out.println("Profile Icon ID: " + summoner.getProfileIconId());

            MatchList matchList = api.getMatchListByAccountId(EUW, summoner.getAccountId());
            System.out.println(matchList.getMatches());
        }catch (Exception e) {
            System.out.println("Error connecting to the Riot api");
        }
    }
}
