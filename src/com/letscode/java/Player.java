package com.letscode.java;

import java.util.Random;
import java.util.Scanner;

public class Player {
    int tiroPosUmPlayer = 0;
    int tiroPosDoisPlayer = 0;
    int tiroPosUmPc = 0;
    int tiroPosDoisPc = 0;

    Scanner numberScanner = new Scanner(System.in);
    Random numberGeneration = new Random();


    public void jogadaPlayer() {
        System.out.println("Certo Capitão, nossa vez de atirar, qual a primeira cordenada?(0 - 3) ");
        tiroPosUmPlayer = numberScanner.nextInt();
        System.out.println("Agora precisamos da segunda cordenada?(0 - 3) ");
        tiroPosDoisPlayer = numberScanner.nextInt();
    }
    public void jogadaPc() {
        tiroPosUmPc = numberGeneration.nextInt(2);
        tiroPosDoisPc = numberGeneration.nextInt(2);
    }
}
