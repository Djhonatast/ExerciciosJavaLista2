//Tendo como dados de entrada a altura, o peso e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando as fórmulas abaixo e exiba se a pessoa está abaixo, no peso ou acima do peso ideal.
	//homens: (72.7 * H) - 58
	//mulheres: (62.1 * H) - 44.7
import java.util.Scanner;
class ExLista2_4{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
double altura, peso;
String sexo;

System.out.print("insira sua altura (ex:1,70): ");
altura = s.nextDouble();
if (altura > 0.5 && altura < 2.5) {
} else {
	System.out.println("Altura inválida! Insira um valor entre 0.5 e 2.5 metros.");
}
System.out.print("insira seu peso: ");
peso =  s.nextDouble();
s.nextLine();
System.out.print("insira seu sexo (masculino/feminino): ");
sexo = s.nextLine();

if (sexo.equalsIgnoreCase("Masculino")) {
	double pesoideal = (72.7*altura)-58;
	System.out.println("Seu peso ideal é: " +  pesoideal);
	if(peso < pesoideal){
System.out.println("Está abaixo do peso ideal");
	} else if(peso > pesoideal){
		System.out.println("Está acima do peso ideal");
	} else{
		System.out.println("Está no peso ideal");
	}
} else if(sexo.equalsIgnoreCase("Feminino")){
	double pesoideal = (62.1 * altura)- 44.7;
	System.out.println("Seu peso ideal é: " + pesoideal);
	if(peso < pesoideal){
		System.out.println("Está abaixo do peso ideal");

	}else if( peso > pesoideal){
		System.out.println("Está acima do peso ideal");

	}else { 
		System.out.println("Está no peso ideal");
	}
}
s.close();
	}
}