package com.letscode.java;

import java.util.Random;

public class Tabuleiros {

    String[][] tabuleiroPlayer = new String[10][10];
    String[][] tabuleiroPc = new String[10][10];
    Random numberGeneration = new Random();


    public void novoTabuleiroPlayer() {
        for (int i = 0; i < 5; i++) {

            int posiUm = numberGeneration.nextInt(5);
            int posiDois = numberGeneration.nextInt(5);

            while (tabuleiroPlayer[posiUm][posiDois] != null ){
                posiUm = numberGeneration.nextInt(5);
                posiDois = numberGeneration.nextInt(5);
            }
            tabuleiroPlayer[posiUm][posiDois] = "N";
        }
    }

    public void novoTabuleiroPc () {
        for (int i = 0; i < 5; i++) {

            int posiUm = numberGeneration.nextInt(5);
            int posiDois = numberGeneration.nextInt(5);

            while (tabuleiroPc[posiUm][posiDois] != null ){
                posiUm = numberGeneration.nextInt(5);
                posiDois = numberGeneration.nextInt(5);
            }

            tabuleiroPc[posiUm][posiDois] = "N";
        }
    }


}
