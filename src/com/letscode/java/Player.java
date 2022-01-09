package com.letscode.java;

import com.letscode.java.tools.ConversorCoordenadas;
import com.letscode.java.tools.Mostrador;
import com.letscode.java.tools.VerificadorRepetido;

import java.util.Random;
import java.util.Scanner;

public class Player {
    char auxConversor;
    int tiroPosUmPlayer;
    int tiroPosDoisPlayer;
    int tiroPosUmPc;
    int tiroPosDoisPc;
    boolean verificador;

    Mostrador mostradorTabuleiro = new Mostrador();

    Scanner numberScanner = new Scanner(System.in);
    Random numberGeneration = new Random();
    VerificadorRepetido numberVerificator = new VerificadorRepetido();
    ConversorCoordenadas conversorCood = new ConversorCoordenadas();


    public void jogadaPlayer() {
        mostradorTabuleiro.mostrarTabuleiroPlayer();
        System.out.println("Certo Capitão, nossa vez de atirar, qual a primeira cordenada?(A - E) ");
        auxConversor = numberScanner.next().charAt(0);
        tiroPosUmPlayer = conversorCood.conversor(auxConversor);
        System.out.println("Agora precisamos da segunda cordenada?(1 - 5) ");
        tiroPosDoisPlayer = conversorCood.conversorNumeros(numberScanner.nextInt());
        verificador = numberVerificator.repetido(tiroPosUmPlayer, tiroPosDoisPlayer);

        while (verificador){
            System.out.println("Essas coordenadas já foram capitão, precisamos de outra, me passe a primeira(A - E) : ");
            auxConversor = numberScanner.next().charAt(0);
            tiroPosUmPlayer = conversorCood.conversor(auxConversor);
            System.out.println("Agora precisamos da segunda cordenada?(1 - 5) ");
            tiroPosDoisPlayer = conversorCood.conversorNumeros(numberScanner.nextInt());
            verificador = numberVerificator.repetido(tiroPosUmPlayer, tiroPosDoisPlayer);

        }

        mostradorTabuleiro.setTabuleiroPlayerJogada(tiroPosUmPlayer, tiroPosDoisPlayer);
        numberVerificator.setHistoricoPlayer(tiroPosUmPlayer, tiroPosDoisPlayer);

    }


    public void jogadaPc() {
        tiroPosUmPc = numberGeneration.nextInt(4);
        tiroPosDoisPc = numberGeneration.nextInt(4);
        verificador = numberVerificator.repetido(tiroPosUmPc, tiroPosDoisPc);
        int i = 0;
        while (verificador){
            tiroPosUmPc = numberGeneration.nextInt(4);
            tiroPosDoisPc = numberGeneration.nextInt(4);
            verificador = numberVerificator.repetido(tiroPosUmPc, tiroPosDoisPc);
            System.out.println("passou" + tiroPosUmPc + tiroPosDoisPc);
            i++;
            if(i>99) break;
        }
        mostradorTabuleiro.setTabuleiroPcJogada(tiroPosUmPc,tiroPosDoisPc);
        numberVerificator.setHistoricoPc(tiroPosUmPc, tiroPosDoisPc);
        mostradorTabuleiro.mostrarTabuleiroPc();


    }
}
