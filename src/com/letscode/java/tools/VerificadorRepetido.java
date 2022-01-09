package com.letscode.java.tools;

public class VerificadorRepetido {

    public String[][] historicoPlayer = new String[5][5];
    public String[][] historicoPc = new String[5][5];

    public void setHistoricoPlayer(int um, int dois) {
        this.historicoPlayer[um][dois] = "T";
    }

    public void setHistoricoPc(int um, int dois) {
        this.historicoPc[um][dois] = "T";

    }

    public boolean repetido (int um, int dois) {

        if(this.historicoPlayer[um][dois] != null) {
            return true;
        }else return false;

    }
}
