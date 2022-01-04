package com.letscode.java;

public class Verificador {

    public String[][] historicoPlayer = new String[3][3];
    public String[][] historicoPc = new String[3][3];

    public void setHistoricoPlayer(int um, int dois) {
        this.historicoPlayer[um][dois] = "X";
    }

    public void setHistoricoPc(int um, int dois) {
        this.historicoPc[um][dois] = "X";

    }

    public boolean repetido (int um, int dois) {

        if(this.historicoPlayer[um][dois] != null) {
            return true;
        }else return false;

    }
}
