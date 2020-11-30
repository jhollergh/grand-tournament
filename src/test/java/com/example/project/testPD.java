package com.example.project;

public class testPD {

    public static void main(String[] args) {
        PDBot PDBot1 = new PDBot();
        PDRandomBot PDBot2 = new PDRandomBot();

        PDTournament myTournament = new PDTournament(100, PDBot1, PDBot2);

        myTournament.runTournament();

    }
}
