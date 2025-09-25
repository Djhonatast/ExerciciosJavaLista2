//Faça um programa que receba uma Mês em formato numérico (1 a 12). Caso o número informado não seja um mês, exiba a mensagem “Valor Inválido”. Depois, compare com o Mês atual e exiba se: “Mês já passou”, “Mês atual” ou “Mês Futuro”.  

import java.util.Scanner;

class ExLista2_7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mes = 0, mesatual = 0;
        System.out.print("Insira qual o mês em forma numérica deseja comparar ex(1 a 12): ");
        if (s.hasNextInt()) {
            mes = s.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.print("Valor inválido insira um mês de 1 a 12.");
                return;
            } }else {
                System.out.print("Entrada inválida, insira um número ");
                return;
            }
        

        System.out.print("Insira o mês atual: ");

        if (s.hasNextInt()) {
            mesatual = s.nextInt();
            if (mesatual < 1 || mesatual > 12) {
                System.out.print("Numero inválido, insira de 1 a 12.");
            } }else {
                System.out.print("Entrada inválida, insira um número.");
            }
        
        if (mes < mesatual) {
            System.out.print("Mês já passou.");
        } else if (mes == mesatual) {
            System.out.print("Mês atual.");
        } else {
            System.out.print("Mês futuro.");
        }

    }
}
