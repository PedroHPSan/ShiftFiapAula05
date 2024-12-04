package Util;

import java.sql.SQLOutput;

public class ClassesExer {

    public static double primeiroElemento(double[] vetor) {
        return vetor[0];
    }
    public static void numerosNegativos(double[] vetor) {

        System.out.println("\nelementos negativos: \n");
        for(int i = 0; i< vetor.length; i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
                System.out.println("");
            }
        }
    }

    public static double somaElementos(double[] vetor){
        double soma=0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static double mediaElementos(double[] vetor){
        double media;
        media = somaElementos(vetor)/ vetor.length;
        return media;
    }

    public static void numerosImpares(double[] vetor){
        System.out.println("\n Numeros impares do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            if( vetor[i] % 2 != 0)
                System.out.println(vetor[i]);
        }
    }

    public static void ultimoPrimeiroElemento(double[] vetor) {
        System.out.println("primeiro elemento do vetor: " + vetor[0]);
        System.out.println("\n Ultimo Elemento do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == vetor.length ){
                System.out.println(vetor[i]);
            }
            System.out.println("primeiro elemento do vetor: " + vetor[0]);
        }
    }

    public static void indicesPares(double[] vetor){
        System.out.println("Elementos com indice par: ");

        for (int i = 0; i < vetor.length ; i++) {
            if (i % 2 == 0)
                System.out.println(vetor[i] + " indice: " + i);
        }
    }

    public static boolean comparaValores(double[] vetor, double valor) {

        for (double elemento : vetor) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }

    public static double ordenaValores(double[] vetor){
        for(double elementos: vetor){
            if (vetor[elementos] >
        }
    }
}
