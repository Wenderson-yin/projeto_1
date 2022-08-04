package com.company;

public class Booleanfuncoes {

    static boolean conjuncao(boolean valorUm, boolean valorDois){
        boolean valor = false;
        if(valorUm && valorDois)
            return true;
        else return false;
    }

    boolean disjuncao(boolean valorUm, boolean valorDois){
        if (valorUm || valorDois)
            return true;
        else return false;
    }

}
