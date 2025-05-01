import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];


        System.out.println("Digite 5 Numeros para o 1 Vetor: ");
        for(int i=0;i<5;i++){
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Digite 5 Numeros para o 2 Vetor: ");
        for(int i=0;i<5;i++){
            vetorB[i] = scanner.nextInt();
        }

        System.out.println("Vetor A: ");
        for(int i=0;i<5;i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");
        System.out.println("Vetor B: ");
        for(int i=0;i<5;i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");

        System.out.println("Vetor C de acordo com os 2 vetores: ");
        for(int i=0;i<5;i++){
            vetorC[i] = vetorA[i];
        }
        for(int i=0;i<5;i++){
            vetorC[i+5] = vetorB[i];
        }

        for(int i=0;i<10;i++){
            System.out.println("Vetor C: " + vetorC[i]);
        }

    }

}