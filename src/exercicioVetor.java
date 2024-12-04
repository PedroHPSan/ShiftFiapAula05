import java.util.Scanner;

public class exercicioVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorMaior = 0, soma = 0, media = 0, inPositivo = 0, ultNegativo = 0;
        int[] vect = new int[10];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o valor do " + (i + 1) + " do vetor");
            vect[i] = sc.nextInt();

            soma = vect[i] + soma;

            if (vect[i] > valorMaior) {
                valorMaior = vect[i];
            } else {

            }
            media = soma / vect.length;

            System.out.println("A soma dos elementos foi: \n" + soma +
                    " e a media dos elementos é: " + media);

            sc.close();
        }
    }
}