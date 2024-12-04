import java.util.Scanner;

import static Util.ClassesExer.*;

public class exercicioClasses {

        /*EXERCÍCIOS:
        1. Fazer uma Função que retorne o primeiro elemento do vetor
        2. Fazer um procedimento que exiba somente os numeros negativos contidos no vetor
        3. Fazer uma função que retorne a soma dos elementos do vetor
        4. Fazer uma função que retorne a media dos elementos do vetos
        5. Fazer um procedimento que exiba na tela os numeros ímpares contidos no vetor
        6. fazer um procedimento que exiba na tela o primeiro e o ultimo elemento do vetor
        7. Fazer um procedimento que exiba os elementos cujos índices sejam pares
        8. Fazer uma função que retorne True caso um valor passado por parâmetro exista no vetor, senão False
        9. Fazer uma função que ordene os elementos do vetor.*/


        public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);

            double[] vetNum = new double[5];
            for (int i = 0; i < vetNum.length; i++) {
                System.out.println("Digite o " + (i + 1) + "º número: ");
                vetNum[i] = leitor.nextInt();
            }
            //1. Fazer uma Função que retorne o primeiro elemento do vetor
            System.out.println("\nO primeiro elemento do vetor é: " + primeiroElemento(vetNum));

            // 2. Fazer um procedimento que exiba somente os numeros negativos contidos no vetor
            numerosNegativos(vetNum);

            // 3. Fazer uma função que retorne a soma dos elementos do vetor

            System.out.println("A soma dos elementos é " + somaElementos(vetNum));

            // 4. Fazer uma função que retorne a media dos elementos do vetor

            System.out.println("\nA media dos elementos do vetor é \n" + mediaElementos(vetNum));

           // 5. Fazer um procedimento que exiba na tela os numeros ímpares contidos no vetor

            numerosImpares(vetNum);

            // 6. fazer um procedimento que exiba na tela o primeiro e o ultimo elemento do vetor

            ultimoPrimeiroElemento(vetNum);

           // 7. Fazer um procedimento que exiba os elementos cujos índices sejam pares

            indicesPares(vetNum);

            // 8. Fazer uma função que retorne True caso um valor passado por parâmetro exista no vetor, senão False
            System.out.println("Insira o valor para comparação com os elementos do vetor ");
            double valor = leitor.nextInt();

            if(comparaValores(vetNum,valor)){
                System.out.println("/nValor " + valor + " existe no vetor");
            } else{
                System.out.println("/nValor " + valor + " NÃO existe no vetor");
            }

           // 9. Fazer uma função que ordene os elementos do vetor.*/






    leitor.close();
    }
}
