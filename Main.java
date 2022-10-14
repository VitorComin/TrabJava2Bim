package trabalho;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    System.out.println ("Adicione suas tarefas:");
    System.out.println ("Tarefa 1:");
    String tarefa1 = ler.nextLine();
    System.out.println ("Tarefa 2:");
    String tarefa2 = ler.nextLine();
    System.out.println ("Tarefa 3:");
    String tarefa3 = ler.nextLine();

    tarefas.add(tarefa1);
    tarefas.add(tarefa2);
    tarefas.add(tarefa3);

    System.out.println(tarefas);

    System.out.println("Deseja concluir tarefa 1, 2 ou 3?:")
    Int concluir = nextInt();
    if (concluir == 1){
        tarefas.remove(tarefa1);
    } else {
        if (concluir == 2) {
            tarefas.remove(tarefa2);
        } else {
            tarefas.remove(tarefa3);
        }
    }
    System.out.println("Que tarefa")
    }
}
