package com.letscode.java;

import java.util.Random;
import java.util.Scanner;

public class Player {
    int tiroPosUmPlayer;
    int tiroPosDoisPlayer;
    int tiroPosUmPc;
    int tiroPosDoisPc;

    String[][] historicoPlayer = new String[3][3];
    String[][] historicoPc = new String[3][3];


    Scanner numberScanner = new Scanner(System.in);
    Random numberGeneration = new Random();


    public void jogadaPlayer() {

        System.out.println("Certo Capitão, nossa vez de atirar, qual a primeira cordenada?(0 - 2) ");
        tiroPosUmPlayer = numberScanner.nextInt();
        System.out.println("Agora precisamos da segunda cordenada?(0 - 2) ");
        tiroPosDoisPlayer = numberScanner.nextInt();
        historicoPlayer[tiroPosUmPlayer][tiroPosDoisPlayer] = "X";
    }


    public void jogadaPc() {
        tiroPosUmPc = numberGeneration.nextInt(2);
        tiroPosDoisPc = numberGeneration.nextInt(2);
        historicoPc[tiroPosUmPc][tiroPosDoisPc] = "X";

    }
}
