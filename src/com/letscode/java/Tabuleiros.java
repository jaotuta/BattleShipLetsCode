package com.letscode.java;

import java.util.Random;

public class Tabuleiros {

    String[][] tabuleiroPlayer = new String[3][3];
    String[][] tabuleiroPc = new String[3][3];
    Random numberGeneration = new Random();


    public void novoTabuleiroPlayer() {
        for (int i = 0; i < 5; i++) {

            int posiUm = numberGeneration.nextInt(3);
            int posiDois = numberGeneration.nextInt(3);

            while (tabuleiroPlayer[posiUm][posiDois] != null ){
                posiUm = numberGeneration.nextInt(3);
                posiDois = numberGeneration.nextInt(3);
            }

            tabuleiroPlayer[posiUm][posiDois] = "X";
        }
    }

    public void novoTabuleiroPc () {
        for (int i = 0; i < 5; i++) {

            int posiUm = numberGeneration.nextInt(3);
            int posiDois = numberGeneration.nextInt(3);

            while (tabuleiroPc[posiUm][posiDois] != null ){
                posiUm = numberGeneration.nextInt(3);
                posiDois = numberGeneration.nextInt(3);
            }

            tabuleiroPc[posiUm][posiDois] = "X";
        }
    }


}
