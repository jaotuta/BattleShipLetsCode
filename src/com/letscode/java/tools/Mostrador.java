package com.letscode.java.tools;

public class Mostrador {

    public String[][] tabuleiroPlayer = new String[5][5];
    public String[][] tabuleiroPc = new String[5][5];
    public String[][] posiNavios = new String[5][5];

    ConversorCoordenadas conversorCoordenadas = new ConversorCoordenadas();

    public void setPosiNavios (String[][] tabu){
        posiNavios = tabu;
    }

    public void setTabuleiroPlayerAcerto(int posUm, int posDois){
        tabuleiroPlayer[posUm][posDois] = "X";
    }

    public void setTabuleiroPlayerJogada(int posUm, int posDois){

        tabuleiroPlayer[posUm][posDois] = "T";
    }
    public void setTabuleiroPcJogada(int posUm, int posDois){

        tabuleiroPc[posUm][posDois] = "T";
    }

    public void mostrarTabuleiroPlayer () {
        String nulo;
        System.out.printf("-----------------------Tiros Player------------------------");
        System.out.println("");
        System.out.printf("_| A || B || C || D || E |");

        for (int i = 0; i < tabuleiroPlayer.length; i++) {
            System.out.println("");
            System.out.print(i+1);
            for ( int j = 0; j < tabuleiroPlayer[0].length; j++){
                if(tabuleiroPlayer[i][j] == null) {
                    nulo = "-";
                }else {
                    nulo = tabuleiroPlayer[i][j];
                }
                System.out.printf("| %s |", nulo);
            }
            System.out.println("");

        }
        System.out.printf("---------------------------------------------------");
        System.out.println("");


    }
    public void mostrarTabuleiroPc () {
        String nulo;
        System.out.printf("-----------------------Tiros Pc------------------------");

        for (int i = 0; i < tabuleiroPc.length; i++) {
            System.out.println("");

            for ( int j = 0; j < tabuleiroPc[0].length; j++){
                if(tabuleiroPc[i][j] == null) {
                    nulo = "-";
                }else {
                    nulo = tabuleiroPc[i][j];
                }
                System.out.printf("| %s |", nulo);
            }
            System.out.println("");

        }
        System.out.printf("---------------------------------------------------------");
        System.out.println("");


    }
}
