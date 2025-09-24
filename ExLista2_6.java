//Faça um algoritmo que receba dois valores e um operador aritmético (+, -, /, * - adição, subtração, divisão e multiplicação). Caso o símbolo seja outro, informe “Símbolo inválido”. Faça o cálculo conforme o operador informado e exiba a expressão e o resultado.
import java.util.Scanner;
class ExLista2_6{
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
String operadorstring;
char operador;
double num1, num2;

System.out.print("Insira o primeiro numero que deseja calcular: ");
num1 = s.nextDouble();
System.out.print("Insira o segundo numero que deseja calcular: ");
num2 = s.nextDouble();
s.nextLine();
System.out.print("Insira qual operador aritmético vai usar (+, -, /, * - adição, subtração, divisão e multiplicação): ");
operadorstring = s.nextLine();
operador = operadorstring.charAt(0);
if(operador == ('+') || operador == ('-') || operador == ('*') || operador == ('/')){
if(operador == ('+')){
System.out.print("Resultado: " + (num1 + num2 ));
}
else if(operador == ('-')){
    System.out.print("Resultado: " + (num1 - num2 ));
    }
    else if(operador == ('*')){
        System.out.print("Resultado: " + (num1 * num2 ));
        }else if(operador == ('/')){
            System.out.print("Resultado: " + (num1 / num2 ));
            }

}else{
    System.out.print("Insira um operador valido");
}


    }
}