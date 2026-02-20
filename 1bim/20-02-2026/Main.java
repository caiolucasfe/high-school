import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Scanner scan = new Scanner(System.in);

        // System.out.println("Digite o nome: ");
        // String nome = scan.next();

        // System.out.println("Digite a idade: ");
        // int idade = scan.nextInt();

        // System.out.println("Digite a altura: ");
        // double altura = scan.nextDouble();

        // Boolean ehDeMaior;

        // System.out.println("O " + nome + " tem " + idade + " anos e " + altura + " de altura");

        // if(idade < 18){
        //     ehDeMaior = false;
        // }
        // else{
        //     ehDeMaior = true;
        // }

        // if(ehDeMaior){
        //     System.out.println("E é maior de idade");
        // }
        // else{
        //     System.out.println("E é menor de idade");
        // }

        int[] vetor;

        vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i + 1;
            System.out.println("Valor do vetor: " + vetor[i]);
            System.out.println("Posição: " + i);
        }

    }

}