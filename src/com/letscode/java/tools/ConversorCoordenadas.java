package com.letscode.java.tools;

public class ConversorCoordenadas {
    public int conversor (char letra) {
        switch (letra){

            case 'A': return 0;
            case 'a': return 0;
            case 'B': return 1;
            case 'b': return 1;
            case 'C': return 2;
            case 'c': return 2;
            case 'D': return 3;
            case 'd': return 3;
            case 'E': return 4;
            case 'e': return 4;
            case 'F': return 5;
            case 'f': return 5;
            case 'G': return 6;
            case 'g': return 6;
            case 'H': return 7;
            case 'h': return 7;
            case 'I': return 8;
            case 'i': return 8;
            case 'J': return 9;
            case 'j': return 9;
        }

    return 333;
    }
    public int conversorNumeros (int number) {
        switch (number){

            case 1: return 0;
            case 2: return 1;
            case 3: return 2;
            case 4: return 3;
            case 5: return 4;
            case 6: return 5;
            case 7: return 6;
            case 8: return 7;
            case 9: return 8;
            case 10: return 9;
        }

        return 333;
    }
}
