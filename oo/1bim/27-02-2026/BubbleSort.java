import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        
        int i, j, aux;

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        for(i = 0; scan.hasNextInt(); i++){
            vetor.add(scan.nextInt());
        }

        System.out.println("Valor antes:");

        for(i = 0; i < vetor.size(); i++){
            System.out.print(vetor.get(i) + " ");
        }

        for(i = 0; i < vetor.size(); i++){
            for(j = 0; j < vetor.size() - i - 1; j++){

                if(vetor.get(j) > vetor.get(j + 1)){

                    aux = vetor.get(j);

                    vetor.set(j, vetor.get(j + 1));
                    vetor.set(j + 1, aux);
                }

            }
        }

        System.out.println("\nValor novo:");

        for(i = 0; i < vetor.size(); i++){
            System.out.print(vetor.get(i) + " ");
        }

        scan.close();

    }
}