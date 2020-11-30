package com.example.project;

public class testCong {

    public static void main(String[] args) {
        CongBot CongBot1 = new CongBot();
        CongBot CongBot2 = new CongBot();

        CongTournament myTournament = new CongTournament(100, CongBot1, CongBot2);

        myTournament.runTournament();

    }
}
