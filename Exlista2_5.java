//Faça um algoritmo que leia o ano de nascimento de uma pessoa, calcule e exiba se: ela já tem idade para votar (16 anos ou mais); se já tem idade para tirar habilitação (18 anos ou mais) ou se é menor de 16 anos “não pode nem votar nem tirar carteira”
import java.util.Scanner;
class Exlista2_5{
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
int anonasc;
int anoatual;

System.out.print("Insira sua data de nascimento: ");
anonasc = s.nextInt();
System.out.print("Insira o ano atual: " );
anoatual = s.nextInt();
int idade = anoatual - anonasc;
if (idade >= 16 &&  idade >=18) {
System.out.println("Você ja pode votar e já tem idade para tirar a habilitação");
}else if(idade >=16 && idade < 18){
    System.out.println("Você pode votar mas ainda não pode tirar habilitação.");
}else{
    System.out.print("Você ainda não pode votar nem tirar habilitação");
}
}
}