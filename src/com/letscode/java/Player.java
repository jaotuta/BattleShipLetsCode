package com.letscode.java;

import java.util.Random;
import java.util.Scanner;

public class Player {
    int tiroPosUmPlayer;
    int tiroPosDoisPlayer;
    int tiroPosUmPc;
    int tiroPosDoisPc;
    boolean verificador;


    Scanner numberScanner = new Scanner(System.in);
    Random numberGeneration = new Random();
    Verificador numberVerificator = new Verificador();


    public void jogadaPlayer() {

        System.out.println("Certo Capitão, nossa vez de atirar, qual a primeira cordenada?(0 - 2) ");
        tiroPosUmPlayer = numberScanner.nextInt();
        System.out.println("Agora precisamos da segunda cordenada?(0 - 2) ");
        tiroPosDoisPlayer = numberScanner.nextInt();
        verificador = numberVerificator.repetido(tiroPosUmPlayer, tiroPosDoisPlayer);
        while (verificador){
            System.out.println("Essas coordenadas já foram capitão, precisamos de outra, me passe a primeira(0 - 2) : ");
            tiroPosUmPlayer = numberScanner.nextInt();
            System.out.println("Agora precisamos da segunda cordenada?(0 - 2) ");
            tiroPosDoisPlayer = numberScanner.nextInt();
            verificador = numberVerificator.repetido(tiroPosUmPlayer, tiroPosDoisPlayer);

        }
        numberVerificator.setHistoricoPlayer(tiroPosUmPlayer, tiroPosDoisPlayer);

    }


    public void jogadaPc() {
        tiroPosUmPc = numberGeneration.nextInt(2);
        tiroPosDoisPc = numberGeneration.nextInt(2);
        verificador = numberVerificator.repetido(tiroPosUmPc, tiroPosDoisPc);
        int i = 0;
        while (verificador){
            tiroPosUmPc = numberGeneration.nextInt(2);
            tiroPosDoisPc = numberGeneration.nextInt(2);
            verificador = numberVerificator.repetido(tiroPosUmPc, tiroPosDoisPc);
            System.out.println("passou");
            i++;
            if(i>99) break;
        }
        numberVerificator.setHistoricoPc(tiroPosUmPlayer, tiroPosDoisPlayer);

    }
}
