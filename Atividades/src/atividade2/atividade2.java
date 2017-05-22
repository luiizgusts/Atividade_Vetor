
package atividade2;

import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {
        float nume[] = new float[10];
        Scanner ler= new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            nume[i] = ler.nextFloat();
        }
        for (int i = 9; i > -1; i--) {
            System.out.println(i+" O numero é:"+nume[i]+".");
        }
    }
    
}
