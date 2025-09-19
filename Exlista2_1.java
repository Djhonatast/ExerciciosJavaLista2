import java.util.Scanner;
class Exlista2_1{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double raio;
    double volume;
    System.out.print("Insira o Raio para calcular o volume da esfera: ");
    raio = s.nextDouble();
    //volume = (4 * Math.PI * Math.pow(raio,3))/3;
    volume = 4.0 / 3.0 * Math.PI * Math.pow(raio,3);
    System.out.printf("O volume da esfera é de %4.4f", volume);



    }
}
