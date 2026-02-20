import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberUser;
        
        int attempts = 0;
        
        int number = (int)Math.random() * 100;

        for(; ;){

            System.out.println("Digite um número inteiro: ");
            numberUser = scan.nextInt();

            attempts++;

            if(numberUser == number){

                System.out.println("Você Acertou!!!\nNúmero de Tentativas: " + attempts);
                break;

            }
            if(numberUser < number){
                
                System.out.println("Digite um número Menor\n");

            }
            else{
                
                System.out.println("Digite um número Maior\n");

            }

        }

    }

}