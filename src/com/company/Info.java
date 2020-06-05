package com.company;

import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.league.dto.LeagueEntry;
import net.rithms.riot.api.endpoints.league.dto.LeagueList;
import net.rithms.riot.api.endpoints.league.methods.GetLeagueById;
import net.rithms.riot.api.endpoints.league.methods.GetLeagueEntriesBySummonerId;
import net.rithms.riot.api.endpoints.match.dto.Mastery;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;
import java.util.List;
import com.google.gson.*;

import java.util.AbstractQueue;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Info {
        Summoner sum = new Summoner();



        //--> WIP - not enough access on current developer key. Applied for key through riot dev portal.

    public String RankSolo(String sumName) throws RiotApiException {
        String rank = "";
        ApiConfig config = new ApiConfig().setKey("RGAPI-d37a4f8f-be19-4f75-8372-99d842921d70");
        RiotApi api = new RiotApi(config);

        //Set<LeagueEntry> leagues = api.getLeagueEntriesBySummonerId(Platform.EUW, sum.getId());
        //for (LeagueEntry league : leagues) {
        //if(league.getQueueType().equals(QueueType.RANKED_SOLO_5x5.name())) {

        return rank;
    }
}
