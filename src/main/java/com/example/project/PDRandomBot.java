package com.example.project;
import java.lang.Math;

public class PDRandomBot extends PDBot {

    public PDRandomBot() {

    }

    public boolean play(boolean a1, boolean b1,
                        boolean a2, boolean b2,
                        boolean a3, boolean b3,
                        double frac, int round, int totalRound) {
        return Math.random() < .5;
    }

    public String toString() {
        return "PDRandomBot";
    }


}
