import java.util.Scanner;
class ExLista2_8{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int idade;





System.out.print("Insira sua idade para conferir em qual categoria da natação você se encaixa: ");
idade =  s.nextInt();



if(idade < 5){
    System.out.println("Idade abaixo do permitido!");

}else if( idade >= 5 && idade <= 7){
    System.out.print("Categoria: Infantil A");
}else if (idade >= 8 && idade <=10 ){
System.out.print("Categoria: Infantil B");
}else if(idade >= 11 && idade <= 13){
    System.out.print("Categoria: Juvenil A");
} else if(idade >= 14 && idade <= 17){
    System.out.print("Categoria: Juvenil B");
} else{
    System.out.print("Categoria: Adulto");
}
}
}
