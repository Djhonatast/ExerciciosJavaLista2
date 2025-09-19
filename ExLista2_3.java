import java.util.Scanner;
class ExLista2_3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int val1, val2, val3;

        System.out.println("Insira abaixo três valores diferentes para que o sistema os escreva em ordem crescente ");
        System.out.print("Insira o primeiro valor: ");
        val1 =  s.nextInt();
        System.out.print("Insira o segundo valor: ");
        val2 =  s.nextInt();
        System.out.print("Insira o terceiro valor: ");
        val3 =  s.nextInt();
        if(val1 < val2 && val1 < val3 && val2 < val3) {
System.out.print(" "+val1+" ");
System.out.print(val2+" ");
System.out.print(val3+" ");
        } else if(val2 < val1 && val2 < val3 && val1 < val3){
            System.out.print(val2+" ");
            System.out.print(val1+" ");
            System.out.print(val3+" ");
        }else if(val3 < val1 && val3 < val2 && val2 < val1){
            System.out.print(val3+" ");
            System.out.print(val2+" ");
            System.out.print(val1+" ");
        }
        else if(val3 < val1 && val3 < val2 && val1 < val2){
            System.out.print(val3+" "); 
            System.out.print(val1+" ");
            System.out.print(val2+" ");

        }
        else if(val2 < val1 && val2 < val3 && val3 < val1){
            System.out.print(val2+" ");
            System.out.print(val3+" "); 
            System.out.print(val1+" ");
        }
        else if (val1 < val2 && val1 < val3 && val3 < val2) {
            System.out.print(val1+" ");
            System.out.print(val3+" "); 
            System.out.print(val2+" ");
        }
    }
}