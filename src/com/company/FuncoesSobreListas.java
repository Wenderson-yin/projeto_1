package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  FuncoesSobreListas{
    private List<String> bancoDeDadosFakeNomeAlunos = new ArrayList<>();

    private List<String> nomesDosAlunos(String s){
        this.bancoDeDadosFakeNomeAlunos.add(s);
        return bancoDeDadosFakeNomeAlunos;

    }

    void metodoDeAdicionamento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("INtroduza o nome do aluno: ");
        for(int i = 0; i < 5; i++){
            String str = scanner.nextLine();
            List<String> listDenomes = this.nomesDosAlunos(str);
        }
        for(String s: this.bancoDeDadosFakeNomeAlunos){
            System.out.println("Nome do Aluno: " + s);
        }
    }
}
