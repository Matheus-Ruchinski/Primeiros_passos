package edu.rachinski.praticando;
public class BoletimEstudantil {
//Identação: Basicamente é um termo utilizado para escrever o
//o código do programa de forma hierárquica, facilitando assim
//visualização e o entendimento do programa
    public static void main (String [] args) {
        int mediaFinal = 7;

            if (mediaFinal<6) {
                System.out.println("Reprovado");
            } else {
                if (mediaFinal==6) {
                    System.out.println("Reprovado Minerva");
                } else {
                    System.out.println("Aprovado");
                }
            }    
    }
}