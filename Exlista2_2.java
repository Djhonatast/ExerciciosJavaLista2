
import java.util.Scanner;

class Exlista2_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matricula;
        double hrtrabalhada, valhora, saltotal, horaextra, numhrextra;
        String mesref;
        System.out.print("Insira sua matricula: ");
        matricula = s.nextInt();
        System.out.print("Insira a quantia de horas trabalhadas: ");
        hrtrabalhada = s.nextDouble();

        System.out.print("Insira o valor que você recebe por hora: ");
        valhora = s.nextDouble();

        System.out.print("Insira o mês referente: ");
        mesref = s.nextLine();

        if (hrtrabalhada > 200) {
            saltotal = hrtrabalhada * valhora;
            horaextra = (saltotal * 50) / 100;
            saltotal = saltotal + horaextra;
            numhrextra = hrtrabalhada - 200;
            System.out.print("Matricula: " + matricula + " Horas trabalhadas: " + hrtrabalhada + " Mês referente: " + mesref + "/" + " Salário do mes: " + saltotal + " Horas extras feitas: " + numhrextra);
        } 
        
            saltotal = hrtrabalhada * valhora;
            System.out.print("Matricula: " + matricula + " Horas trabalhadas: " + hrtrabalhada + " Mês referente: " + mesref + "/" + " Salário do mes: " + saltotal);

s.close();
    }
}
