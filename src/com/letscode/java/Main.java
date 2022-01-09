package com.letscode.java;

import com.letscode.java.tools.Mostrador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Tabuleiros novoTabuleiro = new Tabuleiros();
        Mostrador mostradorTabuleiro = new Mostrador();
        Player player = new Player();

        novoTabuleiro.novoTabuleiroPlayer();
        novoTabuleiro.novoTabuleiroPc();

        //mostradorTabuleiro.posiNavios()

        int gameControllerPlayer = 0;
        int gameControllerPc = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Como devemos chama-lo capitão ?? ");
        String playerName = scanner.next();
        System.out.println("Capitão " + playerName + ", Estamos alocando nossos navios...");

        while (gameControllerPc < 5 && gameControllerPlayer < 5 ) {

            player.jogadaPlayer();

            if( novoTabuleiro.tabuleiroPlayer[player.tiroPosUmPlayer][player.tiroPosDoisPlayer] != null ){
                novoTabuleiro.tabuleiroPlayer[player.tiroPosUmPlayer][player.tiroPosDoisPlayer] = "X";
                gameControllerPlayer++;
                System.out.println("Belo tiro capitão, acertamos em cheio");
                mostradorTabuleiro.setTabuleiroPlayerAcerto(player.tiroPosUmPlayer, player.tiroPosDoisPlayer);

            }else {
                System.out.println("Essa não capitão, erramos o tiro");
                }

           if(gameControllerPlayer != 5) {

            player.jogadaPc();
            System.out.println("Agora é a vez deles atirarem Capitão...");
            if( novoTabuleiro.tabuleiroPc[player.tiroPosUmPc][player.tiroPosDoisPc] != null ){
                novoTabuleiro.tabuleiroPc[player.tiroPosUmPc][player.tiroPosDoisPc] = "X";
                gameControllerPc++;
                System.out.println("Todos se protejam o tiro vai nos acertar em cheio...");
            }else {
                System.out.println("HAHAHA, Alguem os levem a um oculista, acho que estão ficando cegos...");
                }
           }


            System.out.println("Player: " + gameControllerPlayer);
            System.out.println("Pc: " + gameControllerPc);

        }

        if ( gameControllerPlayer == 5) {
            System.out.println("Muito bem Capitão, derrotamos nosso inimigo...");
        }else {
            System.out.println("Dessa vez não deu para nós, voltaremos mais fortes!!!");
        }

    }
    }
